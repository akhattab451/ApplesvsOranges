package com.example.applesvsoranges.source.remote;

import com.example.applesvsoranges.domain.Fruit;
import com.example.applesvsoranges.source.remote.dto.Definition;
import com.example.applesvsoranges.source.remote.dto.FruitResponse;
import com.example.applesvsoranges.util.Mapper;

import javax.inject.Inject;

public class DtoMapper implements Mapper<FruitResponse, Fruit> {

    @Inject
    public DtoMapper() {}

    @Override
    public Fruit mapFromDTO(FruitResponse response) {
        Definition definition = response.getMeanings().get(0).getDefinitions().get(0);
        return new Fruit(response.getWord(), definition.getDefinition(), definition.getExample());
    }

}
