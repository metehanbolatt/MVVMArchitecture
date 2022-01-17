package com.metehanbolat.mvvmarchitecture.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.metehanbolat.mvvmarchitecture.R
import com.metehanbolat.mvvmarchitecture.databinding.ActivityMainBinding
import com.metehanbolat.mvvmarchitecture.model.User
import com.metehanbolat.mvvmarchitecture.repo.ExampleRepo
import com.metehanbolat.mvvmarchitecture.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.button.setOnClickListener {
            binding.textView.text = mainViewModel.changeStringValue("metehan")
        }

    }
}