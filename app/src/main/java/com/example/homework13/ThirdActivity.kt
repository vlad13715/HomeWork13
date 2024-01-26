package com.example.homework13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {

    var btnHome: Button? = null
    var btnSecondScreen: Button? = null
    var btnFourScreen: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        btnHome = findViewById(R.id.btnHome)
        btnSecondScreen = findViewById(R.id.btnSecondScreen)
        btnFourScreen = findViewById(R.id.btnFourScreen)

        setOnClickListeners()
    }

    fun setOnClickListeners() {
        btnHome?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnSecondScreen?.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        btnFourScreen?.setOnClickListener {
            val intent=Intent(this,FourActivity::class.java)
            startActivity(intent)
        }
    }

}