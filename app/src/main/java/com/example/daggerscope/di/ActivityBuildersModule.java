package com.example.daggerscope.di;


import com.example.daggerscope.di.auth.AuthModule;
import com.example.daggerscope.di.auth.AuthScope;
import com.example.daggerscope.di.auth.AuthViewModelsModule;
import com.example.daggerscope.di.main.MainFragmentBuildersModule;
import com.example.daggerscope.di.main.MainModule;
import com.example.daggerscope.di.main.MainScope;
import com.example.daggerscope.di.main.MainViewModelsModule;
import com.example.daggerscope.ui.auth.AuthActivity;
import com.example.daggerscope.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @AuthScope
    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();


    @MainScope
    @ContributesAndroidInjector(
            modules = {MainFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class}
    )
    abstract MainActivity contributeMainActivity();

}
