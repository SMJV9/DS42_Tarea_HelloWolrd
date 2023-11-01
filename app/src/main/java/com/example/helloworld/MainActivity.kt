package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.button2)
        val editText = findViewById<EditText>(R.id.editTextText)

        button.setOnClickListener{
            Toast.makeText(this, "HOLA!! " + editText.text, Toast.LENGTH_SHORT).show()

        }
    }
}