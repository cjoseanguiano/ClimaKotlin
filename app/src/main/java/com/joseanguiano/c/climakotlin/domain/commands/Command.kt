package com.joseanguiano.c.climakotlin.domain.commands

/**
 * Created by Carlos Anguiano on 22/08/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

interface Command<out T> {
    fun execute(): T
}