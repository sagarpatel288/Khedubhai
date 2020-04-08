package com.browngold.khedubhai.user.myapp

import android.app.Application
import com.browngold.khedubhai.user.di.viewmodules.viewModules
import com.browngold.khedubhai.user.di.sharedprefsmodule.coreModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * 4/9/2020
 *
 * <p>
 *
 * </p>
 * Check better way to manage koin between app and common lib modules {@link #} [https://proandroiddev.com/koin-in-feature-modules-project-6329f069f943]
 *
 * @author srdpatel
 * @see <a href="https://proandroiddev.com/koin-in-feature-modules-project-6329f069f943">Better way to manage koin between app and common lib module</a>
 * [Koin in common lib module](https://proandroiddev.com/koin-in-feature-modules-project-6329f069f943 "Better way to manage koin between app and common lib module")
 * @since 1.0
 */
class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(coreModule, viewModules))
        }
    }
}