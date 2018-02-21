package com.github.holidayjp.jdk8

import org.junit.Test
import java.time.LocalDate
import java.time.LocalDateTime
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Test for Holiday
 * Created by pine on 2018/02/21.
 */

class HolidayJpTest {
    @Test
    fun testIsHolidayLocalDate() {
        // should be holiday returns date is holiday or not
        val date1 = LocalDate.of(2011, 9, 19)
        val date2 = LocalDate.of(2011, 9, 18)
        assertTrue(HolidayJp.isHoliday(date1))
        assertFalse(HolidayJp.isHoliday(date2))

        // should be Mountain Day from 2016
        val date3 = LocalDate.of(2015, 8, 11)
        assertFalse(HolidayJp.isHoliday(date3))

        (2016..2050).forEach { i ->
            val date4 = LocalDate.of(i, 8, 11)
            assertTrue(HolidayJp.isHoliday(date4))
        }
    }

    @Test
    fun testIsHolidayLocalDateTime() {
        // should be holiday returns date is holiday or not
        val date1 = LocalDateTime.of(2011, 9, 18, 23, 59, 59, 999999999)
        val date2 = LocalDateTime.of(2011, 9, 19, 0, 0, 0, 0)
        val date3 = LocalDateTime.of(2011, 9, 19, 0, 0, 0, 1)
        val date4 = LocalDateTime.of(2011, 9, 19, 23, 59, 59, 999999999)
        val date5 = LocalDateTime.of(2011, 9, 20, 0, 0, 0, 0)

        assertFalse(HolidayJp.isHoliday(date1))
        assertTrue(HolidayJp.isHoliday(date2))
        assertTrue(HolidayJp.isHoliday(date3))
        assertTrue(HolidayJp.isHoliday(date4))
        assertFalse(HolidayJp.isHoliday(date5))
    }


}