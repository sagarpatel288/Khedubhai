package com.browngold.khedubhai.user.ui.loginsignup.login

import androidx.lifecycle.MutableLiveData
import com.browngold.khedubhai.user.api.ApiService
import com.browngold.khedubhai.user.api.Apis
import com.example.android.common.baseapp.BaseViewModel
import org.koin.core.inject
import org.koin.core.parameter.parametersOf

class LogInViewModel : BaseViewModel() {

    val emailMutableLiveData = MutableLiveData<String>("")
    val countryCodeMutableLiveData = MutableLiveData<String>("")
    val mobileNumberMutableLiveData = MutableLiveData<String>("")
    val uniqueIdMutableLiveData = MutableLiveData<String>("")
    val passwordMutableLiveData = MutableLiveData<String>("")

    private val apiService: ApiService by inject { parametersOf(Apis.BASE_URL, ApiService::class.java) }

}
