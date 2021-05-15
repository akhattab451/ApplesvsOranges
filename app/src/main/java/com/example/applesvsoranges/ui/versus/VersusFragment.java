package com.example.applesvsoranges.ui.versus;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
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

        disposable.add(
                mViewModel.getAppleFlowable()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe(
                                fruit -> {
                                    binding.tvApple.setText(fruit.getWord());
                                    binding.tvAppleDescription.setText(fruit.getDefinition());
                                }
                        )
        );

        disposable.add(
                mViewModel.getOrangeFlowable()
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe(
                                fruit -> {
                                    binding.tvOrange.setText(fruit.getWord());
                                    binding.tvOrangeDescription.setText(fruit.getDefinition());
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