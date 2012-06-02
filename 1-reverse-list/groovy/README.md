Interesting files are located in `src` and `test` directories. The rest are
[gradle](http://www.gradle.org) configuration files and gradle
[wrapper](http://gradle.org/docs/current/userguide/gradle_wrapper.html) that
should help in setting up an environment.

Take a look at [groovy eclipse
plugin](http://groovy.codehaus.org/Eclipse+Plugin) for groovy support in
eclipse.

NOTE: Use `gradlew.bat` instead of `./gradlew` when in Microsoft Windows.

Steps to import this project into eclipse:

 1. Open command line and execute:

        $ ./gradlew eclipse

 2. File -> Import
 3. From "General" select "Existing Projects into Workspace"
 4. Next
 5. Select root directory: one where this readme is located
 6. Finish

Steps to run all Spock tests:

 1. Open command line and execute:

        $ ./gradlew test

 2. Test report is generated in `build/reports/tests` directory. Open
    `index.html` in any browser.

Steps to fool around with gradle:

 1. Open command line and execute:

        $ ./gradlew
