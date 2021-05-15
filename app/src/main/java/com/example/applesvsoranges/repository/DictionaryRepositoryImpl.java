package com.example.applesvsoranges.repository;

import com.example.applesvsoranges.domain.Fruit;
import com.example.applesvsoranges.source.remote.DictionaryService;
import com.example.applesvsoranges.source.remote.DtoMapper;
import com.example.applesvsoranges.source.remote.dto.FruitResponse;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class DictionaryRepositoryImpl implements DictionaryRepository {

    private DictionaryService mDictionaryService;
    private DtoMapper mDtoMapper;

    @Inject
    public DictionaryRepositoryImpl(
            DictionaryService dictionaryService,
            DtoMapper dtoMapper
    ) {
            mDictionaryService = dictionaryService;
            mDtoMapper  = dtoMapper;
    }

    @Override
    public Flowable<Fruit> getFruit(String query) {
        return mDictionaryService.getDefinition(query).map( fruitResponses ->
                        mDtoMapper.mapFromDTO(fruitResponses.get(0))
                );
    }
}
