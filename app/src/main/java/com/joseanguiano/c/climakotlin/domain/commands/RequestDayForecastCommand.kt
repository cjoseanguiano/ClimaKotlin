package com.joseanguiano.c.climakotlin.domain.commands

import com.joseanguiano.c.climakotlin.domain.datasource.ForecastProvider
import com.joseanguiano.c.climakotlin.domain.model.Forecast

/**
 * Created by Carlos Anguiano on 23/08/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

class RequestDayForecastCommand(
        val id: Long,
        val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<Forecast> {

    override fun execute() = forecastProvider.requestForecast(id)
}