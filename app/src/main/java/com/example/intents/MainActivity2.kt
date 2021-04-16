package com.example.intents

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra(Key1)
        val age = intent.getIntExtra(Key2,0)
        val isStudent = intent.getBooleanExtra(Key3,false)
        textView.text = "$name $age $isStudent"
    }
}