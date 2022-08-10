package com.example.mvvm

import com.example.mvvm.User



import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    var  data = MutableLiveData(User("12", "Sazzad" , 12))
    fun updateAge(age:Int ){
        data.value =User( null,null,50)

    }

    fun updateName(name:String ){
//        data.value = User(data.value!!.id, name , data.value!!.age)
    }
}