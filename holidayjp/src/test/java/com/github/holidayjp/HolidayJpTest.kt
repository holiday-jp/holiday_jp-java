package com.github.holidayjp

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Test for Holiday
 * Created by pine on 2018/02/21.
 */

class HolidayJpTest {
    @Test
    fun testIsHolidayString() {
        assertTrue(HolidayJp.isHoliday("2011-09-19"))
        assertFalse(HolidayJp.isHoliday("2011-09-18"))
    }
}