```groovy
def methodWithClosure(closure) {
  println "Inside methodWithClosure"
  closure()
}

def anotherMethod(arg) {
  println "Inside anotherMethod"
  // Execute the closure explicitly
  arg() // Call the closure that is passed in as arg
}

anotherMethod( { methodWithClosure { println "Inside nested closure" }})
//This will now correctly execute all the closures.
```