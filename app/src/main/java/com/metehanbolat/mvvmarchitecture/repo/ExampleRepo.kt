package com.metehanbolat.mvvmarchitecture.repo

import com.metehanbolat.mvvmarchitecture.interfaces.ExampleInterface

class ExampleRepo : ExampleInterface {

    override fun changeStringValue(name: String) = name.uppercase()

    override fun multiply(num1: Int, num2: Int) = num1 * num2

}