package com.predicya.presentation

import android.app.Application
import com.predicya.presentation.di.mLocalModules
import com.predicya.presentation.di.mNetworkModules
import com.predicya.presentation.di.mRepositoryModules
import com.predicya.presentation.di.mUseCaseModules
import com.predicya.presentation.di.mViewModels
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