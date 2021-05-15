package com.example.applesvsoranges.ui.main;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

import android.view.View;
import com.example.applesvsoranges.R;
import com.example.applesvsoranges.databinding.MainFragmentBinding;
import com.example.applesvsoranges.source.remote.DictionaryService;
import com.example.applesvsoranges.source.remote.dto.FruitResponse;

import java.util.List;

import javax.inject.Inject;

@AndroidEntryPoint
public class MainFragment extends Fragment {

    public MainFragment() {
        super(R.layout.main_fragment);
    }

    private MainViewModel mViewModel;
    @Inject
    DictionaryService dictionaryService;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainFragmentBinding binding = MainFragmentBinding.bind(view);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        binding.btnCompare.setOnClickListener(it -> {
            mViewModel.navigateToVersusFragment();
        });

        mViewModel.getEventNavigateToVersusFragment().observe(this.getViewLifecycleOwner(), aBoolean -> {
            if (aBoolean) {
                Navigation.findNavController(view).navigate(
                        MainFragmentDirections.actionMainFragmentToVersusFragment(
                                binding.etApple.getText().toString(),
                                binding.etOrange.getText().toString()
                        )
                );
                mViewModel.navigateToVersusFragmentCompleted();
            }
        });

    }
}