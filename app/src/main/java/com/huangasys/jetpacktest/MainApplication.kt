package com.huangasys.jetpacktest

import android.app.Application
import com.blankj.utilcode.util.Utils

/**
 * Created by "huangasys" on 2020/4/19.23:27
 */
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Utils.init(this)
    }
}