# Groovy Closure Unexpected Behavior as Method Argument

This repository demonstrates an unexpected behavior of Groovy closures when passed as arguments to other methods.  The issue arises when a method that takes a closure as an argument is itself passed as an argument to another method, in a nested way.

## Problem Description

The provided `bug.groovy` file shows a method (`methodWithClosure`) that accepts a closure and executes it. When this method is called directly with a closure, it works correctly. However, when `methodWithClosure` (with its closure argument) is passed as an argument to another method (`anotherMethod`), the closure within `methodWithClosure` is not executed.  Instead, the closure object itself is passed as an argument, resulting in unexpected output.

## Solution

The `bugSolution.groovy` file provides a solution by explicitly executing the closure passed to `anotherMethod`.

This demonstrates a potential pitfall when working with closures in Groovy, especially in scenarios involving nested method calls.