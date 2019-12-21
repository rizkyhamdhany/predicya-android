package com.predictya.data.repository

import com.predictya.data.api.RemoteNewsApi
import com.predictya.domain.entities.NewsSourcesEntity
import com.predictya.data.entities.NewsDataEntityMapper
import io.reactivex.Flowable

class NewsRemoteImpl constructor(private val api:RemoteNewsApi): NewsDataStore {

    private val newsMapper =  NewsDataEntityMapper()

    override fun getNews(): Flowable<NewsSourcesEntity> {

        return api.getNews().map { newsMapper.mapToEntity(it) }
    }

}