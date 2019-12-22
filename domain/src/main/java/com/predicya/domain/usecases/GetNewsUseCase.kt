package com.predicya.domain.usecases

import com.predicya.domain.common.BaseFlowableUseCase
import com.predicya.domain.common.FlowableRxTransformer
import com.predicya.domain.entities.NewsSourcesEntity
import com.predicya.domain.repositories.NewsRepository
import io.reactivex.Flowable

/**
 * It will first get articles from the local database and also update it with the latest
 * articles from remote
 */
class GetNewsUseCase(private val transformer: FlowableRxTransformer<NewsSourcesEntity>,
                     private val repositories: NewsRepository): BaseFlowableUseCase<NewsSourcesEntity>(transformer){

    override fun createFlowable(data: Map<String, Any>?): Flowable<NewsSourcesEntity> {
        return repositories.getNews()
    }

    fun getNews(): Flowable<NewsSourcesEntity>{
        val data = HashMap<String, String>()
        return single(data)
    }
}