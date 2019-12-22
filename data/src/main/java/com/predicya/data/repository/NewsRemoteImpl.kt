package com.predicya.data.repository

import com.predicya.data.api.RemoteNewsApi
import com.predicya.domain.entities.NewsSourcesEntity
import com.predicya.data.entities.NewsDataEntityMapper
import io.reactivex.Flowable

class NewsRemoteImpl constructor(private val api:RemoteNewsApi): NewsDataStore {

    private val newsMapper =  NewsDataEntityMapper()

    override fun getNews(): Flowable<NewsSourcesEntity> {

        return api.getNews().map { newsMapper.mapToEntity(it) }
    }

}