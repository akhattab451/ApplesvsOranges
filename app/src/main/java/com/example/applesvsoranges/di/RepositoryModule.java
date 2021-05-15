package com.example.applesvsoranges.di;

import com.example.applesvsoranges.repository.DictionaryRepository;
import com.example.applesvsoranges.repository.DictionaryRepositoryImpl;

import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;

@Module
@InstallIn(ViewModelComponent.class)
public abstract class RepositoryModule {

    @Binds
    abstract DictionaryRepository bindRepository(DictionaryRepositoryImpl dictionaryRepository);

}
