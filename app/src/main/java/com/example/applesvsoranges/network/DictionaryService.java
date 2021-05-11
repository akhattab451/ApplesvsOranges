package com.example.applesvsoranges.network;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface DictionaryService {

    @GET("v2/entries/en_US/{word}")
    public Observable<List<Response>> getDefinition(@Path("word") String query);
}
