package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var userViewModel: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        userViewModel = ViewModelProvider(this)[UserViewModel::class.java]

//        userViewModel.data.observe(this, Observer{
//            binding.user = it
//        })

        binding.viewModel = userViewModel
        binding.lifecycleOwner = this

//        val value = User("1", "sazzad", 20)


    }
}