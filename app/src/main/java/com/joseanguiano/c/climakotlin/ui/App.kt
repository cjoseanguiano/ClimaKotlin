package com.joseanguiano.c.climakotlin.ui

import android.app.Application
import com.joseanguiano.c.climakotlin.extensions.DelegatesExt


/**
 * Created by Carlos Anguiano on 23/08/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

class App : Application() {

    companion object {
//        var instance: App by DelegatesExt.notNullSingleValue()
        lateinit var instance: App
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}