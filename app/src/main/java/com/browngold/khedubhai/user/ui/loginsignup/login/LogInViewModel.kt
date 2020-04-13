package com.browngold.khedubhai.user.ui.loginsignup.login

import androidx.lifecycle.MutableLiveData
import com.browngold.khedubhai.user.api.ApiService
import com.browngold.khedubhai.user.api.Apis
import com.example.android.common.baseviewmodels.BaseFormViewModel
import org.koin.core.inject
import org.koin.core.parameter.parametersOf

class LogInViewModel : BaseFormViewModel() {

    val emailMutableLiveData = MutableLiveData<String>("")
    val countryCodeMutableLiveData = MutableLiveData<String>("")
    val mobileNumberMutableLiveData = MutableLiveData<String>("")
    val uniqueIdMutableLiveData = MutableLiveData<String>("")
    val passwordMutableLiveData = MutableLiveData<String>("")

    private val apiService: ApiService by inject {
        parametersOf(
            Apis.BASE_URL,
            ApiService::class.java
        )
    }

    fun onClickForgotPassword(
        email: String,
        countryCode: String,
        mobileNumber: String,
        uniqueId: String
    ) {
        // comment by srdpatel: 4/13/2020 Check: email, country code, mobile number and unique id
    }

    fun onClickForgotUniqueId() {

    }

}
