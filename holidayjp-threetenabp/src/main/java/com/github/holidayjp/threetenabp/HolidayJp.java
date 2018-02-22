package com.github.holidayjp.threetenabp;


import org.threeten.bp.LocalDate;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import javax.annotation.Nonnull;

/**
 * HolidayJp for ThreeTenABP
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
