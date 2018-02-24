package com.github.holidayjp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.annotation.Nonnull;

/**
 * HolidayJp
 * Created by pine on 2018/02/21.
 */

public class HolidayJp {
    static final private SimpleDateFormat FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    static final private SimpleDateFormat LOCAL_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    protected HolidayJp() {
    }

    public static boolean isHoliday(@Nonnull String ymd) {
        return Holidays.HOLIDAYS.containsKey(ymd);
    }

    public static boolean isHoliday(int year, int month, int mday) {
        return isHoliday(String.format(Locale.US, "%04d-%02d-%02d", year, month, mday));
    }

    public static boolean isHoliday(@Nonnull Date date) {
        return isHoliday(LOCAL_FORMAT.format(date));
    }

    public static boolean isHoliday(@Nonnull Date date, @Nonnull TimeZone timeZone) {
        synchronized (FORMAT) {
            FORMAT.setTimeZone(timeZone);
            return isHoliday(FORMAT.format(date));
        }
    }

    public static boolean isHoliday(@Nonnull Calendar calendar) {
        return isHoliday(calendar.getTime(), calendar.getTimeZone());
    }

}
