package com.example.applesvsoranges.ui.main;

import javax.inject.Inject;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainViewModel extends ViewModel {

    @Inject
    public MainViewModel(SavedStateHandle savedStateHandle) {

    }
}