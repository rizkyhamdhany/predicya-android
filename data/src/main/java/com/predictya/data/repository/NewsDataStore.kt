package com.predictya.data.repository

import com.predictya.domain.entities.NewsSourcesEntity
import io.reactivex.Flowable


interface NewsDataStore{
    fun getNews(): Flowable<NewsSourcesEntity>
}