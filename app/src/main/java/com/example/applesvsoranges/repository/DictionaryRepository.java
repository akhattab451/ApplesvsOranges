package com.example.applesvsoranges.repository;

import com.example.applesvsoranges.domain.Fruit;
import com.example.applesvsoranges.source.remote.dto.FruitResponse;

import io.reactivex.Flowable;
import io.reactivex.Observable;

public interface DictionaryRepository {

    Flowable<Fruit> getFruit(String query);

}
