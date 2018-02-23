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
    
    // for Java 8 Date and Time API
    compile 'com.github.holidayjp:holidayjp-jdk8:0.1.0'

    // for Joda-Time
    // http://www.joda.org/joda-time/
    compile 'com.github.holidayjp:holidayjp-joda:0.1.0'

    // for Android ThreeTenABP
    // https://github.com/JakeWharton/ThreeTenABP
    compile 'com.github.holidayjp:holidayjp-threetenabp:0.1.0'
}
```

## Example

```java
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
