
# Coding challenge
*********************************************************************************************
Text Wrap Problem
Write a program that takes an input string and prints it as multiple lines of text such that no line of text is greater than 13 characters and words are kept whole.
For example, the first line of the Gettysburg address:
Four score and seven years ago our fathers brought forth upon this continent a new nation, conceived in liberty and dedicated to the proposition that all men are created equal 

Becomes:

Four score 

and seven

years ago our

fathers

brought

forth upon

this

continent a

new nation,

conceived in

liberty and

dedicated to

the

proposition

that all men

are created

equal


*********************************************************************************************

Assumptions:
words longer than 13 characters will not be wrapped.
ambiguity: example contains a possible error at line 15 ('years ago our') - a blank space is a character
Not tested with input larger than 12kb.
WordWrapClient has a hardcoded test file included in the resources directory.

Project is a Java 1.8 maven repo.

