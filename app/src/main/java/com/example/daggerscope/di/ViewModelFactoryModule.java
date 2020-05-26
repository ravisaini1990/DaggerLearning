package com.example.daggerscope.di;


import androidx.lifecycle.ViewModelProvider;

import com.example.daggerscope.viewmodelfactory.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);

}