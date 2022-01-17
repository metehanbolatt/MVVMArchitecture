package com.metehanbolat.mvvmarchitecture.sealed

sealed class ExampleSealed(val name: String)

class Cat(private val catName: String) : ExampleSealed(catName)
class Human(private val humanName: String, val job: String) : ExampleSealed(humanName)

fun greet(exampleSealed: ExampleSealed): String{
    return when(exampleSealed){
        is Human -> "Hello ${exampleSealed.name}; You are working as ${exampleSealed.job}"
        is Cat -> "Hello ${exampleSealed.name}"
    }
}