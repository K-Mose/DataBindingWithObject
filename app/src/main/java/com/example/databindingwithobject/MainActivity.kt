package com.example.databindingwithobject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingwithobject.databinding.ActivityMainBinding
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.student =  getStudent()
        binding.student2 = Student(2,"MOSE","km413.dev@gmail.com")

    }

    private fun getStudent():Student {
        return Student(1, "Mose", "km_413@naver.com")
    }
}