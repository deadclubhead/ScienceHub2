package ru.deadclubhead.sciencehub

class Greeting {
    fun greeting(): String {
        return "Hello, blyat ${Platform().platform}!"
    }
}