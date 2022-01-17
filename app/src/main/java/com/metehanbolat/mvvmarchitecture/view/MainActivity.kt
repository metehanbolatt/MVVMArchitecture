package com.metehanbolat.mvvmarchitecture.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.metehanbolat.mvvmarchitecture.R
import com.metehanbolat.mvvmarchitecture.databinding.ActivityMainBinding
import com.metehanbolat.mvvmarchitecture.model.User
import com.metehanbolat.mvvmarchitecture.repo.ExampleRepo
import com.metehanbolat.mvvmarchitecture.sealed.Cat
import com.metehanbolat.mvvmarchitecture.sealed.Human
import com.metehanbolat.mvvmarchitecture.sealed.greet
import com.metehanbolat.mvvmarchitecture.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    private lateinit var userList: ArrayList<User>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        userList = ArrayList()

        val u1 = User("Metehan","Bolat",3)
        val u2 = User("Kutay","Çetinkurt", 3)
        userList.add(u1)
        userList.add(u2)

        binding.button.setOnClickListener {
            binding.textView.text = mainViewModel.changeStringValue(3 times "metehan")
            println(u1.hashCode())
            println(u2.hashCode())
            userList.forEach {
                println(it.hashCode())
            }
        }

        println(greet(Human("Metehan","Software Developer")))
        println(greet(Cat("Hisa")))

    }

}

infix fun Int.times(str: String) = str.repeat(this)

