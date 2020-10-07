package com.example.horastrabalhadas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCliqueAqui.setOnClickListener {
            var resultado = 0.00
            resultado = (edtHora.text.toString().toDouble() * edtValor.text.toString().toDouble())*1.00
            txtResultado.text = "R$ $resultado"
        }
    }
}