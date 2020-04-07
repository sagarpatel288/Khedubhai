package com.browngold.khedubhai.user.myapp

import android.app.Application
import com.browngold.khedubhai.user.di.viewmodules.viewModules
import com.browngold.khedubhai.user.di.sharedprefsmodule.coreModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(coreModule, viewModules))
        }
    }
}