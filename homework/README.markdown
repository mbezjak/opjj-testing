Homework assignments are considered incomplete if implementation isn't
tested. Use JUnit 4 as in the presentation. Details for each homework are
provided in javadoc.

## HW #1
Implement [factorial](http://en.wikipedia.org/wiki/Factorial) by using TDD.

## HW #2
Augment `6-textual-money` and add support for:

 * millions; numbers: 0 - 999,999,999
 * proper declension:

        tri tisuće kuna
        tri tisuće tri kune
        tri stotine trideset tri tisuće kuna
        tri stotine trideset tri kune

 * lipe

        petnaest kuna i tri lipe
        tri kune i dvadeset devet lipa

## HW #3
Augment `2-stack-calculator` and add support for minus, multiply and integer
division.

## HW #4
Implement [Reverse Polish
notation](http://en.wikipedia.org/wiki/Reverse_polish_notation) calculator with
these assumptions:

 * supported operations are plus `+`, minus `-`, times `*` and integer division
   `/`
 * numbers are one digit long:

        "12+" == 3 // treated as 1 + 2

 * calculator should fail on invalid input, example: `""`, `"+"`, `"1+"`, etc.

Hint: use already implemented stack calculator

## HW #5
Implement [Caesar cipher](http://en.wikipedia.org/wiki/Caesar_cipher) with these
assumptions:

 * only small `[a-z]` characters are rotated
 * every other character (including upper case characters) are left unchanged

Afterwards, decode a couple of secret encrypted messages in a dedicated Java
class.
