package com.predictya.domain.entities

data class NewsSourcesEntity(
        var status: String? = null,
        var articles: List<NewsPublisherEntity> = emptyList()
)