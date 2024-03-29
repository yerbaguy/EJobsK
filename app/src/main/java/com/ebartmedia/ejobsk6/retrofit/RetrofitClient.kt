package com.ebartmedia.ejobsk6.retrofit

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {


    private var ourInstance: Retrofit?=null

    val instance: Retrofit
        get() {

            if (ourInstance == null) {

                ourInstance = Retrofit.Builder()
                    .baseUrl("http://10.0.2.2:8080/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()
            }

            return ourInstance!!
        }
}
