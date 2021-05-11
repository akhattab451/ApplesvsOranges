package com.example.applesvsoranges.ui.versus;

import javax.inject.Inject;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class VersusViewModel extends ViewModel {

    @Inject
    public VersusViewModel(SavedStateHandle savedStateHandle) {

    }
}