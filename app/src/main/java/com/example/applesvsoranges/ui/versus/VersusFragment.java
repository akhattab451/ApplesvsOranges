package com.example.applesvsoranges.ui.versus;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import dagger.hilt.android.AndroidEntryPoint;

import android.view.View;

import com.example.applesvsoranges.R;
import com.example.applesvsoranges.databinding.VersusFragmentBinding;

import org.jetbrains.annotations.NotNull;

@AndroidEntryPoint
public class VersusFragment extends Fragment {

    public VersusFragment() {
        super(R.layout.versus_fragment);
    }

    private VersusViewModel mViewModel;

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        VersusFragmentBinding binding = VersusFragmentBinding.bind(view);
        mViewModel = new ViewModelProvider(this).get(VersusViewModel.class);
    }
}