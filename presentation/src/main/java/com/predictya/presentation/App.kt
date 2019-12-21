package com.predictya.presentation

import android.app.Application
import com.predictya.presentation.di.mLocalModules
import com.predictya.presentation.di.mNetworkModules
import com.predictya.presentation.di.mRepositoryModules
import com.predictya.presentation.di.mUseCaseModules
import com.predictya.presentation.di.mViewModels
import org.koin.android.ext.android.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        loadKoin()
    }

    private fun loadKoin() {
        startKoin(this,
                listOf(
                    mNetworkModules,
                    mViewModels,
                    mRepositoryModules,
                    mUseCaseModules,
                    mLocalModules
                )

        )
    }
}