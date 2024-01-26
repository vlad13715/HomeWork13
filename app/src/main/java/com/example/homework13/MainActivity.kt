package com.example.homework13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var btnSeconScreen: Button? = null
    var btnThirdScreen: Button? = null
    var btnFourScreen: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSeconScreen = findViewById(R.id.btnSecondScreen)
        btnThirdScreen = findViewById(R.id.ThirdScreen)
        btnFourScreen = findViewById(R.id.btnFourScreen)


        setOnClickListeners()
    }

    fun setOnClickListeners() {
        btnSeconScreen?.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btnThirdScreen?.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
        btnFourScreen?.setOnClickListener {
            val intent = Intent(this,FourActivity::class.java)
            startActivity(intent)
        }

    }

}