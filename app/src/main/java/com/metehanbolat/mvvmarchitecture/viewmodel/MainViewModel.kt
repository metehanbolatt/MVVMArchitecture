package com.metehanbolat.mvvmarchitecture.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.metehanbolat.mvvmarchitecture.model.User
import com.metehanbolat.mvvmarchitecture.repo.ExampleRepo

class MainViewModel: ViewModel() {

    private val repo = ExampleRepo()

    var users = MutableLiveData<List<User>>()

    fun userData(user : User){

        val userList = arrayListOf(user)

        users.value = userList
    }

    fun changeStringValue(name: String) = repo.changeStringValue(name)

}