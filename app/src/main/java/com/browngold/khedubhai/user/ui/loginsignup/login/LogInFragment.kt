package com.browngold.khedubhai.user.ui.loginsignup.login

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import com.browngold.khedubhai.user.R
import com.browngold.khedubhai.user.databinding.FragmentLogInBinding
import com.example.android.common.baseapp.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class LogInFragment : BaseFragment<FragmentLogInBinding, LogInViewModel>(R.layout.fragment_log_in) {

    companion object {
        fun newInstance() = LogInFragment()
    }

    override val viewModel: LogInViewModel by viewModel()
    private lateinit var dataBinding: FragmentLogInBinding

    override fun dataBinding(dataBinding: ViewDataBinding) {
        this.dataBinding = dataBinding as FragmentLogInBinding
    }

    override fun otherStuffs() {

    }
}
