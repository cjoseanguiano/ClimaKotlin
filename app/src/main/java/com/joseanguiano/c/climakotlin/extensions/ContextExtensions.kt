package com.joseanguiano.c.climakotlin.extensions

import android.content.Context
import android.support.v4.content.ContextCompat

/**
 * Created by Carlos Anguiano on 23/08/17.
 * For more info contact: c.joseanguiano@gmail.com
 */

fun Context.color(res: Int): Int = ContextCompat.getColor(this, res)