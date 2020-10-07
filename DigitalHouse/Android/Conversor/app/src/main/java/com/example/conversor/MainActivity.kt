package com.example.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCliqueAqui.setOnClickListener {

            val resultado = (((edtValor.text.toString().toInt())*9)/5) + 32
            txtResultado.text = "$resultado °F"
        }

    }
}