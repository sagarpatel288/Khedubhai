package com.browngold.khedubhai.user.di.sharedprefsmodule

import android.content.Context
import android.util.Patterns
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module
import java.util.regex.Pattern


val coreModule = module {

    single {
        androidApplication().getSharedPreferences("khedubhai", Context.MODE_PRIVATE)
    }

    single<Pattern> {
        Patterns.EMAIL_ADDRESS
    }
}