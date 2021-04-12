package com.ltts.androidday1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        buttonLoginnext.setOnClickListener{

            var myintent2 = Intent(this ,MainActivity::class.java)
            startActivity(myintent2)

        }
        buttonLoginnext1.setOnClickListener{

            var myintent3 = Intent(this ,MainActivity3::class.java)
            startActivity(myintent3)

        }



    }
}