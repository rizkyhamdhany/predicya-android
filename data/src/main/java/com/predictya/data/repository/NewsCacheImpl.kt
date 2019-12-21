package com.predictya.data.repository

import com.predictya.data.db.ArticlesDao
import com.predictya.data.db.NewsDatabase
import com.predictya.data.entities.NewsDataEntityMapper
import com.predictya.data.entities.NewsEntityDataMapper
import com.predictya.domain.entities.NewsSourcesEntity
import io.reactivex.Flowable

class NewsCacheImpl(private val database: NewsDatabase,
                    private val entityToDataMapper: NewsEntityDataMapper,
                    private val dataToEntityMapper: NewsDataEntityMapper) : NewsDataStore {

    private val dao: ArticlesDao = database.getArticlesDao()

    override fun getNews(): Flowable<NewsSourcesEntity> {
        return dao.getAllArticles().map { it ->
            dataToEntityMapper.mapToEntity(it)
        }
    }

    fun saveArticles(it: NewsSourcesEntity) {
        dao.clear()
        dao.saveAllArticles(it.articles.map { articles -> entityToDataMapper.mapArticleToEntity(articles) })
    }

}