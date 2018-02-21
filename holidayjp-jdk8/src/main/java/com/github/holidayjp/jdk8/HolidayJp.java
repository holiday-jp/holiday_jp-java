package com.github.holidayjp.jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.annotation.Nonnull;

/**
 * HolidayJp for Java 8 or later
 * Created by pine on 2018/02/22.
 */

public class HolidayJp extends com.github.holidayjp.HolidayJp {
    protected HolidayJp() {
        super();
    }

    public static boolean isHoliday(@Nonnull LocalDate date) {
        String ymd = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        return isHoliday(ymd);
    }

    public static boolean isHoliday(@Nonnull LocalDateTime date) {
        return isHoliday(date.toLocalDate());
    }

    public static boolean isHoliday(@Nonnull ZonedDateTime date) {
        return isHoliday(date.toLocalDate());
    }

    public static boolean isHoliday(@Nonnull OffsetDateTime date) {
        return isHoliday(date.toLocalDate());
    }
}
