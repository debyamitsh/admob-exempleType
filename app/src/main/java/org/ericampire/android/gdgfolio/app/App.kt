package org.ericampire.android.gdgfolio.app

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCenter.start(
            this, "dbed6fa1-5953-42c8-92f8-e7b15db2f631",
            Analytics::class.java, Crashes::class.java
        )
    }
}