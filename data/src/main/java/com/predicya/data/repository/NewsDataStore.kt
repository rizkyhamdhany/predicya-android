package com.predicya.data.repository

import com.predicya.domain.entities.NewsSourcesEntity
import io.reactivex.Flowable


interface NewsDataStore{
    fun getNews(): Flowable<NewsSourcesEntity>
}