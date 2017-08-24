package com.joseanguiano.c.climakotlin.domain.datasource

import com.joseanguiano.c.climakotlin.data.db.ForecastDb
import com.joseanguiano.c.climakotlin.data.server.ForecastServer
import com.joseanguiano.c.climakotlin.domain.model.Forecast
import com.joseanguiano.c.climakotlin.domain.model.ForecastList
import com.joseanguiano.c.climakotlin.extensions.firstResult

/**
 * Created by Carlos Anguiano on 23/08/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

class ForecastProvider(val sources: List<ForecastDataSource> = ForecastProvider.SOURCES) {

    companion object {
        val DAY_IN_MILLIS = 1000 * 60 * 60 * 24
        val SOURCES by lazy { listOf(ForecastDb(), ForecastServer()) }
    }

    fun requestByZipCode(zipCode: Long, days: Int): ForecastList = requestToSources {
        val res = it.requestForecastByZipCode(zipCode, todayTimeSpan())
        if (res != null && res.size >= days) res else null
    }

    fun requestForecast(id: Long): Forecast = requestToSources { it.requestDayForecast(id) }

    private fun todayTimeSpan() = System.currentTimeMillis() / DAY_IN_MILLIS * DAY_IN_MILLIS

    private fun <T : Any> requestToSources(
            f: (ForecastDataSource) -> T?): T = sources.firstResult { f(it) }

}