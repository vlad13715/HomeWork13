package com.example.homework13

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourActivity : AppCompatActivity() {

    var btnHome:Button?=null
    var btnSecondScreen:Button?=null
    var btnThirdScreen:Button?=null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        btnHome=findViewById(R.id.btnHome)
        btnSecondScreen=findViewById(R.id.btnSecondScreen)
        btnThirdScreen=findViewById(R.id.btnThirdScreen)


        setOnClickListeners()
    }

    fun setOnClickListeners(){
        btnHome?.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnSecondScreen?.setOnClickListener {
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        btnThirdScreen?.setOnClickListener {
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
    }


}