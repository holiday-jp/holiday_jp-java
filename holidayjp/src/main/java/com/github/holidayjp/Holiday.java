package com.github.holidayjp;

import javax.annotation.Nonnull;

/**
 * Holiday
 * Created by pine on 2018/02/21.
 */

public final class Holiday {
    @Nonnull
    private final String ymd;

    @Nonnull
    private final String week;

    @Nonnull
    private final String weekEn;

    @Nonnull
    private final String name;

    @Nonnull
    private final String nameEn;

    Holiday(
            @Nonnull String ymd,
            @Nonnull String week,
            @Nonnull String weekEn,
            @Nonnull String name,
            @Nonnull String nameEn
    ) {
        this.ymd = ymd;
        this.week = week;
        this.weekEn = weekEn;
        this.name = name;
        this.nameEn = nameEn;
    }

    @Nonnull
    public String getYmd() {
        return ymd;
    }

    @Nonnull
    public String getWeek() {
        return week;
    }

    @Nonnull
    public String getWeekEn() {
        return weekEn;
    }

    @Nonnull
    public String getName() {
        return name;
    }

    @Nonnull
    public String getNameEn() {
        return nameEn;
    }
}
