package com.ltts.androidday1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast.makeText as makeText1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonClickhome.setOnClickListener{
            var uname = editTextTextEmailAddress.text.toString()
            var password = editTextTextPassword.text.toString()
            if(uname=="Amit" && password=="123")
            {
                var myintent = Intent(this ,MainActivity2::class.java)
                startActivity(myintent)
            }
            else
            { Toast.makeText(getApplicationContext(),"Type correct credentials",Toast.LENGTH_SHORT).show()}



        }
    }
}