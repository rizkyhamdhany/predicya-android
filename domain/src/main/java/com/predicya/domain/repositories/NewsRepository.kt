package com.predicya.domain.repositories

import com.predicya.domain.entities.NewsSourcesEntity
import io.reactivex.Flowable

interface NewsRepository {

    fun getNews(): Flowable<NewsSourcesEntity>
    fun getLocalNews(): Flowable<NewsSourcesEntity>
    fun getRemoteNews(): Flowable<NewsSourcesEntity>

}