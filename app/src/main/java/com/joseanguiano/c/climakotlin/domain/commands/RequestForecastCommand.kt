package com.joseanguiano.c.climakotlin.domain.commands

import com.joseanguiano.c.climakotlin.domain.datasource.ForecastProvider
import com.joseanguiano.c.climakotlin.domain.model.ForecastList

/**
 * Created by Carlos Anguiano on 22/08/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

class RequestForecastCommand(
        val zipCode: Long,
        val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<ForecastList> {

    companion object {
        val DAYS = 7
    }

    override fun execute() = forecastProvider.requestByZipCode(zipCode, DAYS)
}