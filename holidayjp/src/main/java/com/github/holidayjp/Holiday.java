package com.github.holidayjp;

/**
 * Holiday
 * Created by pine on 2018/02/21.
 */

public final class Holiday {
    private final String ymd;
    private final String week;
    private final String weekEn;
    private final String name;
    private final String nameEn;
    
    Holiday(
            String ymd,
            String week,
            String weekEn,
            String name,
            String nameEn
    ) {
        this.ymd = ymd;
        this.week = week;
        this.weekEn = weekEn;
        this.name = name;
        this.nameEn = nameEn;
    }

    public String getYmd() {
        return ymd;
    }

    public String getWeek() {
        return week;
    }

    public String getWeekEn() {
        return weekEn;
    }

    public String getName() {
        return name;
    }

    public String getNameEn() {
        return nameEn;
    }
}
