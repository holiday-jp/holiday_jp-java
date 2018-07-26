# holiday_jp Java

[![Build Status](https://travis-ci.org/holiday-jp/holiday_jp-java.svg?branch=master)](https://travis-ci.org/holiday-jp/holiday_jp-java)

:crossed_flags: Japanese holiday for Java

## Table of Contents

- [Requirements](#requirements)
- [Installing](#installing)
- [Supported libraries](#supported-libraries)
  - [Java 8 Date and Time API](#java-8-date-and-time-api)
  - [Joda-Time](#joda-time)
  - [ThreeTenABP](#threetenabp)
- [Example](#example)
  - [Java 7](#java-7)
  - [Java 8](#java-8)
  - [ThreeTenABP + Kotlin](#threetenabp--kotlin)
- [References](#references)
  - [class com.github.holidayjp.HolidayJp](#class-comgithubholidayjpholidayjp)
  - [class com.github.holidayjp.Holiday](#class-comgithubholidayjpholiday)
  - [class com.github.holidayjp.jdk8.HolidayJp](#class-comgithubholidayjpjdk8holidayjp)
  - [class com.github.holidayjp.joda.HolidayJp](#class-comgithubholidayjpjodaholidayjp)
  - [class com.github.holidayjp.threetenabp.HolidayJp](#class-comgithubholidayjpthreetenabpholidayjp)
- [For developer](#for-developer)
  - [Development](#development)
  - [Test](#test)
  - [Publish to jcenter](#publish-to-jcenter)
- [See also](#see-also)
- [License](#license)

## Requirements

- Java 7 or later

## Installing

```groovy
repositories {
    jcenter()
}

dependencies {
    compile 'com.github.holidayjp:holidayjp:2.0.0'
}
```

## Supported libraries
### Java 8 Date and Time API
`LocalDate`, `LocalDateTime`, `ZonedDateTime` and `OffsetDateTime` classes are supported.

```groovy
compile 'com.github.holidayjp:holidayjp-jdk8:2.0.0'
```

### [Joda-Time](http://www.joda.org/joda-time/)
`LocalDate`, `LocalDateTime` and `DateTime` classes are supported.

```groovy
compile 'com.github.holidayjp:holidayjp-joda:2.0.0'
```

### [ThreeTenABP](https://github.com/JakeWharton/ThreeTenABP)
ThreeTenABP is polyfill of Java 8 Date and Time API for Android. `LocalDate`, `LocalDateTime`, `ZonedDateTime` and `OffsetDateTime` classes are supported.

```groovy
implementation 'com.github.holidayjp:holidayjp-threetenabp:2.0.0'
```

## Example
### Java 7

```java
import java.util.*;
import com.github.holidayjp.HolidayJp;

Date today = new Date();
if (HolidayJp.isHoliday(today)) {
    System.out.println("Today is a holiday!");
}
```

### Java 8

```java
import java.time.*;
import com.github.holidayjp.jdk8.HolidayJp;

LocalDate today = LocalDate.now();
if (HolidayJp.isHoliday(today)) {
    System.out.println("Today is a holiday!");
}
```

### ThreeTenABP + Kotlin
The library is compatible with Android (>= API level 15).

```kotlin
import org.threeten.bp.*
import com.github.holidayjp.threetenabp.HolidayJp

val today = LocalDate.now()
if (HolidayJp.isHoliday(today)) {
    println("Today is a holiday!")
}
```

## References
### `class com.github.holidayjp.HolidayJp`
This is utility class for Java 7 or earlier.

#### `boolean HolidayJp.isHoliday(@Nonnull String ymd)`

Judge whether it is a holiday in Japan. If a date is holiday, return `true`.
`ymd` parameter should be formatted `YYYY-MM-DD`.

```java
import com.github.holidayjp.HolidayJp;

if (HolidayJp.isHoliday("2018-12-01")) {
    System.out.println("2018/12/01 is a holiday!");
}
```

#### `boolean HolidayJp.isHoliday(int year, int month, int mday)`

Judge whether it is a holiday in Japan. If a date is holiday, return `true`.

```java
import com.github.holidayjp.HolidayJp;

if (HolidayJp.isHoliday(2018, 12, 1)) {
    System.out.println("2018/12/01 is a holiday!");
}
```

#### `boolean HolidayJp.isHoliday(@Nonnull Date date)`

Judge whether it is a holiday in Japan. If a date is holiday, return `true`.

```java
import java.util.*;
import com.github.holidayjp.HolidayJp;

Date today = new Date();
if (HolidayJp.isHoliday(today)) {
    System.out.println("Today is a holiday!");
}
```

#### `boolean HolidayJp.isHoliday(@Nonnull Date date, @Nonnull TimeZone timeZone)`

Judge whether it is a holiday in Japan. If a date is holiday, return `true`.
`timeZone` parameter is used to judge holiday.

```java
import java.util.*;
import com.github.holidayjp.HolidayJp;

Calendar calendar = Calendar.getInstance();
TimeZone timeZone = TimeZone.getTimeZone("UTC");
calendar.setTimeZone(timeZone);

Date today = calendar.getTime();
if (HolidayJp.isHoliday(today, timeZone)) {
    System.out.println("Today is a holiday!");
}
```

#### `boolean HolidayJp.isHoliday(@Nonnull Calendar calendar)`

Judge whether it is a holiday in Japan. If a date is holiday, return `true`.
The time zone setting of `calendar` is used to judge holiday.

```java
import java.util.*;
import com.github.holidayjp.HolidayJp;

Calendar calendar = Calendar.getInstance();
if (HolidayJp.isHoliday(calendar)) {
    System.out.println("Today is a holiday!");
}
```

### `class com.github.holidayjp.Holiday`
`Holiday` class represents holiday data.

```java
import java.util.*;
import com.github.holidayjp.Holiday;
import com.github.holidayjp.HolidayJp;

Calendar calendar = Calendar.getInstance();
calendar.set(2015, 9 - 1, 23);
Date date = calendar.getTime();

Holiday holiday = HolidayJp.between(date, and: date)[0];

System.out.println(holiday.getYmd());    // "2015-09-23"
System.out.println(holiday.getWeek());   // "火"
System.out.println(holiday.getWeekEn()); // "Tuesday"
System.out.println(holiday.getName());   // "秋分の日"
System.out.println(holiday.getNameEn()); // "Autumnal Equinox Day"
```

### `class com.github.holidayjp.jdk8.HolidayJp`
This is utility class for Java 8 or later.


#### `boolean HolidayJp.isHoliday(@Nonnull LocalDate)`
#### `boolean HolidayJp.isHoliday(@Nonnull LocalDateTime date)`
#### `boolean HolidayJp.isHoliday(@Nonnull ZonedDateTime date)`
#### `boolean HolidayJp isHoliday(@Nonnull OffsetDateTime date)`

Judge whether it is a holiday in Japan. If a date is holiday, return `true`.

```java
import java.time.*;
import com.github.holidayjp.jdk8.HolidayJp;

LocalDate today = LocalDate.now();
if (HolidayJp.isHoliday(today)) {
    System.out.println("Today is a holiday!");
}
```

### `class com.github.holidayjp.joda.HolidayJp`
This is utility class for [Joda-Time](http://www.joda.org/joda-time/).


#### `boolean HolidayJp.isHoliday(@Nonnull LocalDate)`
#### `boolean HolidayJp.isHoliday(@Nonnull LocalDateTime date)`
#### `boolean HolidayJp.isHoliday(@Nonnull DateTime date)`

Judge whether it is a holiday in Japan. If a date is holiday, return `true`.

```java
import org.joda.time.*;
import com.github.holidayjp.joda.HolidayJp;

LocalDate today = LocalDate.now();
if (HolidayJp.isHoliday(today)) {
    System.out.println("Today is a holiday!");
}
```

### `class com.github.holidayjp.threetenabp.HolidayJp`
This is utility class for [ThreeTenABP](https://github.com/JakeWharton/ThreeTenABP).


#### `boolean HolidayJp.isHoliday(@Nonnull LocalDate)`
#### `boolean HolidayJp.isHoliday(@Nonnull LocalDateTime date)`
#### `boolean HolidayJp.isHoliday(@Nonnull ZonedDateTime date)`
#### `boolean HolidayJp isHoliday(@Nonnull OffsetDateTime date)`

Judge whether it is a holiday in Japan. If a date is holiday, return `true`.

```java
import org.threeten.bp.*;
import com.github.holidayjp.threetenabp.HolidayJp;

LocalDate today = LocalDate.now();
if (HolidayJp.isHoliday(today)) {
    System.out.println("Today is a holiday!");
}
```

## For developer
### Development
Please run gradle task to re-generate holidays definitions.

```
$ ./gradlew generate
```

### Test

```
$ ./gradlew check connectedCheck
```

### Publish to jcenter

```
$ export BINTRAY_USER=username
$ export BINTRAY_API_KEY=apiKey
$ ./gradlew clean assemble bintrayUpload
```

## See also
- https://github.com/holiday-jp/holiday_jp

## License
MIT &copy; Pine Mizune
