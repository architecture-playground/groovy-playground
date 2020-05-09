#!/usr/bin/env groovy
package closure

def stage(String nameString, Closure closure) {
    // black box
}

def steps(Closure closure) {
    // black box
}

def tests(String repoName){

}

stage("Tests") {
    steps {
        tests("user-service")
    }
}
