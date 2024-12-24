```groovy
def methodWithClosure(closure) {
  println "Inside methodWithClosure"
  closure()
}

methodWithClosure { println "Inside closure" }

//This will work fine

def anotherMethod(arg){
  println arg
}

anotherMethod(methodWithClosure{println "Inside closure"})

//This will not work as expected. methodWithClosure will not execute, only returns a closure object.
```