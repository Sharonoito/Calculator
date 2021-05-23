package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var etEnternumber = findViewById<EditText>(R.id.etEnternumber)
        var etEnternumber2 = findViewById<EditText>(R.id.etEnternumber2)
        var btnAdd = findViewById<Button>(R.id.btnAdd)
        var btnSubtract = findViewById<Button>(R.id.btnSubtract)
        var btnMultiply = findViewById<Button>(R.id.btnMultiply)
        var btnModulus = findViewById<Button>(R.id.btnModulus)
        var tvResult = findViewById<TextView>(R.id.tvResults)


        btnAdd.setOnClickListener {
            var num1=etEnternumber.text.toString().toInt()
            var num2=etEnternumber2.text.toString().toInt()
            var sum=num1+num2
            tvResult.text="$sum"

        }
        btnSubtract.setOnClickListener {
            var num1=etEnternumber.text.toString().toInt()
            var num2=etEnternumber2.text.toString().toInt()
            var subtract=num1-num2
            tvResult.text="$subtract"
        }
        btnMultiply.setOnClickListener {
            var num1=etEnternumber.text.toString().toInt()
            var num2=etEnternumber2.text.toString().toInt()
            var multiply=num1*num2
            tvResult.text="$multiply"
        }
        btnModulus.setOnClickListener {
            var num1=etEnternumber.text.toString().toInt()
            var num2=etEnternumber2.text.toString().toInt()
            var modulus=num1%num2
            tvResult.text="$modulus"
        }
        }
    }

