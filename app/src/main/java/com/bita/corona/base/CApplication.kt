package com.bita.corona.base

import com.and.base.ui.BaseApplication
import com.bita.corona.di.appModules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CApplication : BaseApplication() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            if (IS_DEBUG) androidLogger()

            // Android Context given
            androidContext(this@CApplication)
            modules(appModules)
        }
    }
}