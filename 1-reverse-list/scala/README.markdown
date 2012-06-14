Interesting files are located in `src/main/scala` and `src/test/scala`
directories. The rest are [sbt](https://github.com/harrah/xsbt/wiki)
configuration files that should help in setting up an environment.

Start by installing scala [typesafe
stack](http://typesafe.com/stack/download). Take a look at [scala eclipse
plugin](http://scala-ide.org/download/current.html) for scala support in
eclipse.

## Import
Steps to import this project into eclipse:

 1. Open command line and execute:

        $ sbt eclipse

 2. File -> Import
 3. From "General" select "Existing Projects into Workspace"
 4. Next
 5. Select root directory: one where this readme is located
 6. Finish

## Test
Steps to run all scala tests:

 1. Open command line and execute:

        $ sbt test

## Fool around
Steps to fool around with sbt:

 1. Open command line and execute:

        $ sbt
