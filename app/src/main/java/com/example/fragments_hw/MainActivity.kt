package com.example.fragments_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = Fragment1()
        val fragment2 = Fragment2()


    supportFragmentManager.beginTransaction().apply {
        //resources
        replace(R.id.fragment,fragment1)
        commit()
    }



    }
}