package com.example.applesvsoranges.ui.versus;

import android.os.Bundle;

import com.example.applesvsoranges.domain.Fruit;
import com.example.applesvsoranges.repository.DictionaryRepository;
import javax.inject.Inject;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;

@HiltViewModel
public class VersusViewModel extends ViewModel {

    private DictionaryRepository mDictionaryRepository;
    private SavedStateHandle mSavedStateHandle;

    private CompositeDisposable disposables = new CompositeDisposable();


    @Inject
    public VersusViewModel(
            SavedStateHandle savedStateHandle,
            DictionaryRepository dictionaryRepository
    ) {
        mDictionaryRepository = dictionaryRepository;
        mSavedStateHandle = savedStateHandle;
    }

    public Flowable<Fruit> getAppleFlowable() {
        return mDictionaryRepository.getFruit(mSavedStateHandle.get("apple"));
    }

    public Flowable<Fruit> getOrangeFlowable() {
        return mDictionaryRepository.getFruit(mSavedStateHandle.get("orange"));
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        disposables.clear();
    }

}