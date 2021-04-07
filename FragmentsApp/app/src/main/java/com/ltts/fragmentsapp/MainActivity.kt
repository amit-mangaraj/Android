package com.ltts.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonRed.setOnClickListener(){
            supportFragmentManager.beginTransaction().replace(R.id.fragment_green,RedFragment()).commit()
        }


        buttonBlue.setOnClickListener{
            var blueFragment = BlueFragment()
            var myManager : FragmentManager= supportFragmentManager
            var myTransaction:FragmentTransaction = myManager.beginTransaction()
            myTransaction.replace(R.id.fragment_green,blueFragment)
            myTransaction.commit()
        }

    }
}
