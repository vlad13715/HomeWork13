package com.example.homework13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {

    var btnHome: Button? = null
    var btnThirdActivity: Button? = null
    var btnFourScreen: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnHome = findViewById(R.id.btnHome)
        btnThirdActivity = findViewById(R.id.btnThirdScreen)
        btnFourScreen = findViewById(R.id.btnFourScreen)

        setOnClickListeners()
    }

    fun setOnClickListeners() {
        btnHome?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btnThirdActivity?.setOnClickListener {
            val intent=Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
        btnFourScreen?.setOnClickListener {
            val intent=Intent(this,FourActivity::class.java)
            startActivity(intent)
        }
    }

}