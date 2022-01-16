package com.metehanbolat.mvvmarchitecture.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.metehanbolat.mvvmarchitecture.model.User

class MainViewModel: ViewModel() {

    var users = MutableLiveData<List<User>>()

    fun userData(user : User){

        val userList = arrayListOf(user)

        users.value = userList
    }

}