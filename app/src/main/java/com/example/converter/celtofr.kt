package com.example.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class celtofr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_celtofr)

        var inputt : EditText =findViewById(R.id.value)
        var result : TextView =findViewById(R.id.answer)

        var but1 : Button = findViewById(R.id.but1)
        var but2 :Button =findViewById(R.id.but2)


        but1.setOnClickListener {
            var B = inputt.text.toString().toFloat()

            var res = (B * 9/5) + 32

            result.text = "$res   in faren "
        }
        but2.setOnClickListener {
            var B = inputt.text.toString().toFloat()

            var res = (B - 32) * 5/9


            result.text = "$res   in cel"
        }


    }
}