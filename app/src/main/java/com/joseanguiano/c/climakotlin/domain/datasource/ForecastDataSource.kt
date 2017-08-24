package com.joseanguiano.c.climakotlin.domain.datasource

import com.joseanguiano.c.climakotlin.domain.model.Forecast
import com.joseanguiano.c.climakotlin.domain.model.ForecastList

/**
 * Created by Carlos Anguiano on 23/08/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

interface ForecastDataSource {

    fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList?

    fun requestDayForecast(id: Long): Forecast?

}