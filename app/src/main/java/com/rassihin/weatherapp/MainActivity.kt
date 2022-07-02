package com.rassihin.weatherapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private var user_field: EditText? = null
    private var mainButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user_field = findViewById(R.id.editTextMain)
        mainButton = findViewById(R.id.buttonMain)

        mainButton?.setOnClickListener{
            if(user_field?.text?.toString()?.trim()?.equals("")!!)
                Toast.makeText(this, "Enter your city", Toast.LENGTH_LONG).show()
            else {
                var city: String = user_field?.text.toString()
                var key: String = ""
            }
        }
    }
}