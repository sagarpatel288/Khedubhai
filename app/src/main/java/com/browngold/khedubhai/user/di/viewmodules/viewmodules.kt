package com.browngold.khedubhai.user.di.viewmodules

import com.browngold.khedubhai.user.ui.loginsignup.LogInSignUpViewModel
import com.browngold.khedubhai.user.ui.loginsignup.login.LogInViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModules = module {

    viewModel {
        LogInSignUpViewModel()
    }

    viewModel {
        LogInViewModel()
    }
}