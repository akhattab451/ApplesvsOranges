package com.example.applesvsoranges.ui.versus;


import com.example.applesvsoranges.domain.Fruit;
import com.example.applesvsoranges.repository.DictionaryRepository;
import javax.inject.Inject;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;

@HiltViewModel
public class VersusViewModel extends ViewModel {

    private DictionaryRepository mDictionaryRepository;
    private SavedStateHandle mSavedStateHandle;

    @Inject
    public VersusViewModel(
            SavedStateHandle savedStateHandle,
            DictionaryRepository dictionaryRepository
    ) {
        mDictionaryRepository = dictionaryRepository;
    }

    public Flowable<Fruit> getFruitFlowable(String query) {
        return mDictionaryRepository.getFruit(query);
    }


}