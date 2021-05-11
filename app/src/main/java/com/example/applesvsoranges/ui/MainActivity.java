package com.example.applesvsoranges.ui;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import dagger.hilt.android.AndroidEntryPoint;

import android.os.Bundle;

import com.example.applesvsoranges.R;
import com.example.applesvsoranges.databinding.MainActivityBinding;
import com.example.applesvsoranges.util.Utils;

import java.util.Objects;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MainActivityBinding binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = Objects.requireNonNull(navHostFragment).getNavController();

        navController.addOnDestinationChangedListener((controller, destination, arguments) -> Utils.hideKeyboard(this));
    }
}