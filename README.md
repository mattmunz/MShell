# MShell

A humane shell.

# Overview

Mshell is a general purpose interactive shell. (Mshell is a provisional name.)

The primary motivation for this shell is that while text UIs are helpful, shell programming 
can be a pain. Wouldn't it be nice to have a higher-level (typed) language to use when 
working with the shell? An additional motivation is that many text UIs are arcane. Let's  
explore the development of a truly humane text UI.

## Release Notes

7/28/16 Some simple commands are supported, based on Spring Shell. 

## Status

There's not much here yet. More designs and commands are needed...

# User guide

TODO Implement the user guide.

# Design

Initially just a collection of scripts and shell function, but intended to grow into a 
Java program, potentially having a daemon component and also potentially having a 
lightweight native front end.

## V1 Domain model

Command group
+ Name -- globally unique

Command
+ Name -- globally unique
+ execute(Arguments)
+ HelpContent

CommandRegistry
+ Commands

Interpreter
-- Takes a string of text and executes commands accordingly

CLI -- UI for interpreter

## V2 Design using Spring Shell

### Modules

Core -- Uses spring-shell to boot a basic shell
Extensions -- Includes commands from unpublished stuff
-- Jot, NextToDo, CLI, Miscellany
-- Babe (build/clean), Scripting (mp)

Some shell scripts divided between these two projects too. Over time, the extensions will 
be published...

# TODO 

Provide better deployment instructions.
All documentation should be made available online in the application(s).
Publish more extensions (see Design for details)
...

## Contact

Please contact [Matt Munz](https://github.com/mattmunz) if you have any difficulty or 
to provide feedback (which would be very welcome).

## Author

[Matt Munz](https://github.com/mattmunz)

