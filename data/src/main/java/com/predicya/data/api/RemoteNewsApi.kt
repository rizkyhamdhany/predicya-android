package com.predicya.data.api

import com.predicya.data.entities.NewsSourcesData
import io.reactivex.Flowable
import retrofit2.http.GET

interface RemoteNewsApi {

    @GET("top-headlines?country=us")
    fun getNews(): Flowable<NewsSourcesData>

}