package com.example.applesvsoranges.ui.main;

import com.example.applesvsoranges.repository.DictionaryRepository;

import javax.inject.Inject;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainViewModel extends ViewModel {

    private DictionaryRepository mDictionaryRepository;

    @Inject
    public MainViewModel(SavedStateHandle savedStateHandle) {}

    private MutableLiveData<Boolean> _eventNavigateToVersusFragment = new MutableLiveData<>(false);
    public LiveData<Boolean> getEventNavigateToVersusFragment() {
        return _eventNavigateToVersusFragment;
    }

    public void navigateToVersusFragment() {
        _eventNavigateToVersusFragment.postValue(true);
    }

    public void navigateToVersusFragmentCompleted() {
        _eventNavigateToVersusFragment.postValue(false);
    }
}