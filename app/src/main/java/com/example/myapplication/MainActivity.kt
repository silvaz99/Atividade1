package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstInput : TextInputEditText = findViewById(R.id.firstInput)
        val secondInput : TextInputEditText = findViewById(R.id.secondInput)
        val button : Button = findViewById<Button>(R.id.button)
        val resultText : TextView = findViewById(R.id.textView)
        button.setOnClickListener{
            println( firstInput.text.toString())
            val num1 = firstInput.text.toString()
            val num2 = secondInput.text.toString()
            resultText.text = (num1.toInt() + num2.toInt()).toString()
        }
    }
}