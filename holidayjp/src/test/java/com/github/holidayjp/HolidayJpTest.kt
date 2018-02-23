package com.github.holidayjp

import org.junit.Test
import java.util.*
import kotlin.test.assertFalse
import kotlin.test.assertTrue

/**
 * Test for HolidayJp
 * Created by pine on 2018/02/21.
 */

class HolidayJpTest {
    @Test
    fun testIsHolidayString() {
        assertTrue(HolidayJp.isHoliday("2011-09-19"))
        assertFalse(HolidayJp.isHoliday("2011-09-18"))
    }

    @Test
    fun testIsHolidayYearMonthMday() {
        assertTrue(HolidayJp.isHoliday(2011, 9, 19))
        assertFalse(HolidayJp.isHoliday(2011, 9, 18))
    }

    @Test
    fun testIsHolidayDate() {
        // Local offset
        run {
            val calendar = Calendar.getInstance(Locale.US)

            calendar.set(2011, 9 - 1, 19)
            val date1 = calendar.time

            calendar.set(2011, 9 - 1, 18)
            val date2 = calendar.time

            assertTrue(HolidayJp.isHoliday(date1))
            assertFalse(HolidayJp.isHoliday(date2))
        }

        // UTC
        run {
            val calendar = Calendar.getInstance()
            val timeZone = TimeZone.getTimeZone("UTC")
            calendar.timeZone = timeZone

            calendar.set(2011, 9 - 1, 19)
            val date1 = calendar.time

            calendar.set(2011, 9 - 1, 18)
            val date2 = calendar.time

            assertTrue(HolidayJp.isHoliday(date1, timeZone))
            assertFalse(HolidayJp.isHoliday(date2, timeZone))
        }

    }

    @Test
    fun testIsHolidayCalendar() {
        // Local offset
        run {
            val calendar = Calendar.getInstance(Locale.US)

            calendar.set(2011, 9 - 1, 19)
            val date1 = calendar.clone() as Calendar

            calendar.set(2011, 9 - 1, 18)
            val date2 = calendar.clone() as Calendar

            assertTrue(HolidayJp.isHoliday(date1))
            assertFalse(HolidayJp.isHoliday(date2))
        }

        // UTC
        run {
            val calendar = Calendar.getInstance()
            val timeZone = TimeZone.getTimeZone("UTC")
            calendar.timeZone = timeZone

            calendar.set(2011, 9 - 1, 19)
            val date1 = calendar.clone() as Calendar

            calendar.set(2011, 9 - 1, 18)
            val date2 = calendar.clone() as Calendar

            assertTrue(HolidayJp.isHoliday(date1))
            assertFalse(HolidayJp.isHoliday(date2))
        }
    }

}