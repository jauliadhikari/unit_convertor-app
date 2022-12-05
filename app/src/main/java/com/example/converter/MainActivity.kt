package com.example.converter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var feet:Button = findViewById(R.id.feet)

        var cel:Button = findViewById(R.id.cel)

        var kg:Button = findViewById(R.id.kg)

        var km:Button = findViewById(R.id.km)

        feet.setOnClickListener {

            val intent = Intent(this , feettocm ::class.java)
            startActivity(intent)
        }
        cel.setOnClickListener {

            val intent = Intent(this , celtofr ::class.java)
            startActivity(intent)
        }
        kg.setOnClickListener {

            val intent = Intent(this , kgtopounds ::class.java)
            startActivity(intent)
        }
        km.setOnClickListener {
            val intent = Intent(this , kmtomiles ::class.java)
            startActivity(intent)
        }



    }

}