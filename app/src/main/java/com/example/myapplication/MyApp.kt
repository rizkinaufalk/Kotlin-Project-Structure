package com.example.myapplication

import android.app.Application
import androidx.databinding.library.BuildConfig
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import timber.log.Timber
import javax.inject.Inject

class MyApp : Application(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector:DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG)
        Timber.plant(Timber.DebugTree())
    }

    override fun androidInjector() = dispatchingAndroidInjector
}