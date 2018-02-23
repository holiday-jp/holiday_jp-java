# holiday_jp Java

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
ThreeTenABP is polyfill of Java 8 Date and Time API. `LocalDate`, `LocalDateTime`, `ZonedDateTime` and `OffsetDateTime` classes are supported.

```groovy
compile 'com.github.holidayjp:holidayjp-threetenabp:0.1.0'
```

## Example

TODO

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
