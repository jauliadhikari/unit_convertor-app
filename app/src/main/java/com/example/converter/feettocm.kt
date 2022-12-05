package com.example.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class feettocm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feettocm)

        var inputt : EditText =findViewById(R.id.value)
        var result : TextView =findViewById(R.id.answer)

        var but1 :Button = findViewById(R.id.but1)
        var but2 :Button =findViewById(R.id.but2)

        but1.setOnClickListener {
            val B = inputt.text.toString().toFloat()
            val res = B * 30.48
            result.text = " $res  in cm"

        }

        but2.setOnClickListener {
            val B = inputt.text.toString().toFloat()
            val res = B / 30.48
            result.text = " $res  in feet"

        }

    }


}