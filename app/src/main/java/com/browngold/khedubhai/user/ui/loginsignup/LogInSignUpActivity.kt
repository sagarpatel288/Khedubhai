package com.browngold.khedubhai.user.ui.loginsignup

import android.content.SharedPreferences
import androidx.databinding.ViewDataBinding
import com.browngold.khedubhai.user.R
import com.browngold.khedubhai.user.databinding.ActivityLogInSignUpBinding
import com.example.android.common.baseapp.BaseActivity
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class LogInSignUpActivity :
    BaseActivity<ActivityLogInSignUpBinding, LogInSignUpViewModel>(R.layout.activity_log_in_sign_up) {

    override val viewModel: LogInSignUpViewModel by viewModel()
    private val sharedPrefs: SharedPreferences by inject()

    override fun dataBinding(dataBinding: ViewDataBinding) {

    }

    override fun otherStuffs() {

    }

    override fun setObservers() {

    }
}
