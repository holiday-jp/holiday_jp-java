package com.github.holidayjp.joda;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.format.ISODateTimeFormat;

import javax.annotation.Nonnull;

/**
 * HolidayJp for Joda-Time
 * Created by pine on 2018/02/24.
 */

public class HolidayJp extends com.github.holidayjp.HolidayJp {
    protected HolidayJp() {
        super();
    }

    public static boolean isHoliday(@Nonnull LocalDate date) {
        String ymd = date.toString(ISODateTimeFormat.yearMonthDay());
        return isHoliday(ymd);
    }

    public static boolean isHoliday(@Nonnull LocalDateTime date) {
        return isHoliday(date.toLocalDate());
    }

    public static boolean isHoliday(@Nonnull DateTime date) {
        return isHoliday(date.toLocalDate());
    }
}
