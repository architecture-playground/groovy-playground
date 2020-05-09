#!/usr/bin/env groovy
package closure


def execute(Closure[] closures) {
    //we can write anyone code before executing closures
    for (i = 0; i < closures.length; i++) {
        closures[i].call()
    }
}

execute
        {
            println("closure1")
        }
        {
            println("closure2")
        }
        {
            println("closure3")
        }
