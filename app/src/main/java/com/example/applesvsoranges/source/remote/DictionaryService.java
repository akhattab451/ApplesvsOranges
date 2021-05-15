package com.example.applesvsoranges.source.remote;

import com.example.applesvsoranges.source.remote.dto.FruitResponse;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DictionaryService {

    @GET("v2/entries/en_US/{word}")
    public Flowable<List<FruitResponse>> getDefinition(@Path("word") String query);
}
