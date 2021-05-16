package com.example.applesvsoranges.ui.versus;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import android.view.View;

import com.example.applesvsoranges.R;
import com.example.applesvsoranges.databinding.VersusFragmentBinding;

import org.jetbrains.annotations.NotNull;

@AndroidEntryPoint
public class VersusFragment extends Fragment {

    public VersusFragment() {
        super(R.layout.versus_fragment);
    }

    private final CompositeDisposable disposable = new CompositeDisposable();

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        VersusFragmentBinding binding = VersusFragmentBinding.bind(view);
        VersusViewModel mViewModel = new ViewModelProvider(this).get(VersusViewModel.class);

        VersusFragmentArgs args = VersusFragmentArgs.fromBundle(getArguments());

        disposable.add(
                mViewModel.getFruitFlowable(args.getApple())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe(
                                fruit -> {
                                    binding.tvApple.setText(fruit.getWord());
                                    binding.tvAppleDescription.setText(fruit.getDefinition());
                                },
                                throwable -> {
                                    binding.tvApple.setText(args.getApple());
                                    binding.tvAppleDescription.setText(
                                            String.format(getString(R.string.error_template),
                                                    throwable.getMessage(),
                                                    args.getApple())
                                    );
                                }
                        )
        );

        disposable.add(
                mViewModel.getFruitFlowable(args.getOrange())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe(
                                fruit -> {
                                    binding.tvOrange.setText(fruit.getWord());
                                    binding.tvOrangeDescription.setText(fruit.getDefinition());
                                },
                                throwable -> {
                                    binding.tvOrange.setText(args.getOrange());
                                    binding.tvOrangeDescription.setText(
                                            String.format(getString(R.string.error_template),
                                            throwable.getMessage(),
                                            args.getOrange())
                                    );

                                }
                        )
        );

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        disposable.clear();
    }
}