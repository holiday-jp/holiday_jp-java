package com.github.holidayjp;

import java.util.Calendar;
import java.util.Date;

import javax.annotation.Nonnull;

/**
 * HolidayJp
 * Created by pine on 2018/02/21.
 */

public class HolidayJp {
    protected HolidayJp() {
    }

    public static boolean isHoliday(@Nonnull String ymd) {
        return Holidays.HOLIDAYS.containsKey(ymd);
    }

    public static boolean isHoliday(@Nonnull Date date) {
        throw new UnsupportedOperationException();
    }

    public static boolean isHoliday(@Nonnull Calendar calendar) {
        throw new UnsupportedOperationException();
    }
}
