# holiday_jp Java

[![Build Status](https://travis-ci.org/pine/holiday_jp-java.svg?branch=master)](https://travis-ci.org/pine/holiday_jp-java)

:crossed_flags: Japanese holiday for Java

## Requirements

- Java 7 or later

## Installing

```groovy
repositories {
    jcenter()
}

dependencies {
    compile 'com.github.holidayjp:holidayjp:0.1.0'
}
```

## Supported libraries
### Java 8 Date and Time API
`LocalDate`, `LocalDateTime`, `ZonedDateTime` and `OffsetDateTime` classes are supported.

```groovy
compile 'com.github.holidayjp:holidayjp-jdk8:0.1.0'
```

### [Joda-Time](http://www.joda.org/joda-time/)
`LocalDate`, `LocalDateTime` and `DateTime` classes are supported.

```groovy
compile 'com.github.holidayjp:holidayjp-joda:0.1.0'
```

### [ThreeTenABP](https://github.com/JakeWharton/ThreeTenABP)
ThreeTenABP is polyfill of Java 8 Date and Time API for Android. `LocalDate`, `LocalDateTime`, `ZonedDateTime` and `OffsetDateTime` classes are supported.

```groovy
compile 'com.github.holidayjp:holidayjp-threetenabp:0.1.0'
```

## Example
### Java 8

```java
import java.time.*;
import com.github.holidayjp.jdk8.HolidayJp;

LocalDate today = LocalDate.now();
if (HolidayJp.isHoliday(today)) {
    System.out.println("Today is a holiday!");
}
```

## API
### `class com.github.holidayjp.HolidayJp`
This is utility class for Java 7 or earlier.

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

#### `boolean HolidayJp.isHoliday(int year, int month, int mday)`

Judge whether it is a holiday in Japan. If a date is holiday, return `true`.

```java
import com.github.holidayjp.HolidayJp;

if (HolidayJp.isHoliday(2018, 12, 1)) {
    System.out.println("2018/12/01 is a holiday!");
}
```

### `class Holiday`
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
System.out.println(holiday.getName())   // "秋分の日"
System.out.println(holiday.getNameEn()); // "Autumnal Equinox Day"
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
