Import this project into Eclipse and complete given homework
assignments. Skeleton implementation code is provided in `src` directory.

Homework assignments are considered incomplete if implementation isn't
tested. Use JUnit 4 as in the presentation.

## HW #1
Implement [factorial](http://en.wikipedia.org/wiki/Factorial) by using TDD.

## HW #2
Implement new features in `MoneyToTextConverter`:

 * millions

        pedeset sedam milijuna kuna
        osam stotina milijuna kuna

 * proper declension

        tri tisuće kuna
        tri tisuće tri kune
        tri stotine trideset tri tisuće kuna
        tri stotine trideset tri kune

 * lipe

        petnaest kuna i tri lipe
        tri kune i dvadeset devet lipa

## HW #3
Implement minus, multiply and integer division methods in `StackCalculator`.

    calc.push(3).push(4).minus().result();    // 1
    calc.push(4).push(3).multiply().result(); // 12
    calc.push(3).push(4).divide().result();   // 1
    calc.push(3).push(6).divide().result();   // 2

## HW #4
Implement [Reverse Polish
notation](http://en.wikipedia.org/wiki/Reverse_polish_notation) calculator with
these assumptions:

 * supported operations are plus `+`, minus `-`, times `*`, integer division `/`
   and no other
 * numbers are one digit long:

        "12+"   == 3  // treated as 2 + 1
        "57*"   == 35 // treated as 7 * 5
        "34/"   == 1  // treated as 4 / 3
        "123++" == 6  // treated as (3 + 2) + 1

 * calculator should throw exception on invalid input, example: `""`, `"+"`,
   `"1+"`, etc.
 * calculator should throw exception when, after consuming all input, stack
   isn't reduced to only one item

        "123+" // error, stack is [1, 5]
        "1"    // ok, stack is [1]

Hint: use stack calculator; there is no need to use mocks

## HW #5
Implement [Caesar cipher](http://en.wikipedia.org/wiki/Caesar_cipher) with these
assumptions:

 * input string consists only of [ASCII](http://en.wikipedia.org/wiki/Ascii)
   characters
 * only lower case `[a-z]` characters are rotated
 * every other character (including upper case characters) are left unchanged

Afterwards, decode a couple of secret encrypted messages in a dedicated Java
class.
