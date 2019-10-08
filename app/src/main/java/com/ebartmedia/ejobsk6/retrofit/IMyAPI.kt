package com.ebartmedia.ejobsk6.retrofit

import com.ebartmedia.ejobsk6.model.Categories
import io.reactivex.Observable
import retrofit2.http.GET

interface IMyAPI {


    @get:GET("api/getinfo")
    val categories: Observable<List<Categories>>
}
