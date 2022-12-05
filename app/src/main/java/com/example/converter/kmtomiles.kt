package com.example.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class kmtomiles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kmtomiles)

        var result : TextView = findViewById(R.id.answer)

        var inputt : EditText = findViewById(R.id.value)

        var butt  : Button  = findViewById(R.id.but1)

        var buttt :Button   = findViewById(R.id.but2)

        butt.setOnClickListener {

            var inp =inputt.text.toString().toFloat()

            var  answer = inp * 1.609

            result.text = "$answer    Miles "
        }

        buttt.setOnClickListener {

            var inp =inputt.text.toString().toFloat()

            var  answer = inp / 1.609

            result.text = "$answer    Km "
        }

    }
}