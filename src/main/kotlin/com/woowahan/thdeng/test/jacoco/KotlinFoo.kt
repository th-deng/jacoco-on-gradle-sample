package com.woowahan.thdeng.test.jacoco

class KotlinFoo {

    fun hello(name: String): String = when {
        name == "Hello" ->  "world"
        name == "펭" ->  "하"
        name.length > 5 -> "TOO LONG"
        else -> "no one"
    }

    fun callMe() {
        println("Please, call me")
    }

}
