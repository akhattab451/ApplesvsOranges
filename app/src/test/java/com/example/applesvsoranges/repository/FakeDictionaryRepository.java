package com.example.applesvsoranges.repository;

import com.example.applesvsoranges.domain.Fruit;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Flowable;

public class FakeDictionaryRepository implements DictionaryRepository {

    private final List<Fruit> fruits = new ArrayList<>(
            List.of(new Fruit("apple", "red fruit", "throw me an apple"),
                    new Fruit("orange", "orange fruit", "hand me an orange"))
    );

    @Override
    public Flowable<Fruit> getFruit(String query) {

        for (Fruit fruit : fruits) {
            if (query.equals(fruit.getWord()))
                return Flowable.just(fruit);
        }

        return null;
    }
}
