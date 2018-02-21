package com.github.holidayjp

import org.junit.Test
import kotlin.test.assertTrue

/**
 * Test for Holidays
 * Created by pine on 2018/02/21.
 */
class HolidaysTest {
    @Test
    fun testHolidays() {
        assertTrue(Holidays.HOLIDAYS.isNotEmpty())
    }
}