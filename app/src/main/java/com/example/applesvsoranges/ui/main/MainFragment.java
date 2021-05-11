package com.example.applesvsoranges.ui.main;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import dagger.hilt.android.AndroidEntryPoint;
import android.view.View;
import com.example.applesvsoranges.R;
import com.example.applesvsoranges.databinding.MainFragmentBinding;

@AndroidEntryPoint
public class MainFragment extends Fragment {

    public MainFragment() {
        super(R.layout.main_fragment);
    }

    private MainViewModel mViewModel;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        MainFragmentBinding binding = MainFragmentBinding.bind(view);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        binding.btnCompare.setOnClickListener(it -> {
            Navigation.findNavController(view).navigate(MainFragmentDirections.actionMainFragmentToVersusFragment());
        });

    }
}