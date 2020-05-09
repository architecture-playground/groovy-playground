#!/usr/bin/env groovy
package closure

def runClosureByCondition(Boolean condition, Closure closure) {
    // we can do some additional logic before running this closure
    if (condition) {
        closure.call()
    }
    // we can do post logic after running this closure
}

runClosureByCondition(true, { println("this closure was passed inside parameters") })

runClosureByCondition(true) {
    println("This closure was passed after parameters")
}

runClosureByCondition(false){
    println("this code must not be invoked")
}
