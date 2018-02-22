package com.github.holidayjp.threetenabp

import android.app.Application
import android.support.test.runner.AndroidJUnit4
import org.junit.runner.RunWith
import com.jakewharton.threetenabp.AndroidThreeTen
import android.support.test.InstrumentationRegistry
import org.junit.Test


/**
 * HolidayJpTest for ThreeTenABP
 * Created by pine on 2018/02/22.
 */

@RunWith(AndroidJUnit4::class)
class HolidayJpTest {
    private val context = InstrumentationRegistry.getTargetContext().applicationContext

    @Test
    fun foo() {
        AndroidThreeTen.init(context)
    }
}