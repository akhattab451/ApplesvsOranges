package com.example.applesvsoranges.di;

import com.example.applesvsoranges.source.remote.DictionaryService;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
@InstallIn(SingletonComponent.class)
public class NetworkModule {

    @Provides
    public Retrofit provideRetrofit() {
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .baseUrl("https://api.dictionaryapi.dev/api/")
                .build();
    }

    @Provides
    public DictionaryService provideService(Retrofit retrofit) {
        return retrofit.create(DictionaryService.class);
    }

}
