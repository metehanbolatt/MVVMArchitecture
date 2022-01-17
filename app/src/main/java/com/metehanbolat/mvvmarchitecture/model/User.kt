package com.metehanbolat.mvvmarchitecture.model

data class User(
    val name: String,
    val surname: String,
    val age: Int
) {
    override fun equals(other: Any?) = other is User && other.age == this.age
}