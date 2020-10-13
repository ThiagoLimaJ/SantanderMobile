package com.example.horastrabalhadas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCliqueAqui.setOnClickListener {
            var resultado: Double = (edtHora.text.toString().toDouble() * edtValor.text.toString().toDouble())
            txtResultado.text = "R$ $resultado"
        }
    }
}