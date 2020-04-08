package com.browngold.khedubhai.user.api

import android.os.Parcelable
import com.example.android.common.basemodels.BaseLogInRequest
import com.example.android.common.basemodels.BaseResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST(Apis.LOG_IN)
    suspend fun <T : Parcelable> login(@Body baseLogInRequest: BaseLogInRequest): BaseResponse<T>
}