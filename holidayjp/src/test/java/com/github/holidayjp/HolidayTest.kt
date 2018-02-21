package com.github.holidayjp

import org.junit.Test
import kotlin.test.assertEquals

/**
 * Test for Holiday
 * Created by pine on 2018/02/21.
 */

class HolidayTest {
    @Test
    fun testConstructor() {
        val holiday = Holiday("2018-01-30", "火", "Tuesday", "テストの日", "Test Day")

        assertEquals(holiday.ymd, "2018-01-30")
        assertEquals(holiday.week, "火")
        assertEquals(holiday.weekEn, "Tuesday")
        assertEquals(holiday.name, "テストの日")
        assertEquals(holiday.nameEn, "Test Day")
    }
}