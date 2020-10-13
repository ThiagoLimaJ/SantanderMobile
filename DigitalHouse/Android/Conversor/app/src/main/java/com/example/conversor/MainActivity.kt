package com.example.conversor


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

const val ERROR_TEXT = "Favor inserir valor"

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnConverter.setOnClickListener {

            val numero = etValor.text.toString().toInt()
            val resultado = (((numero*9)/5) + 32).toString()

            if (resultado.isNotEmpty()) {
                txtResultado.text = "$resultado °F"
                txtResultado.visibility = View.VISIBLE
            } else{
                etValor.error = ERROR_TEXT
            }
        }

    }
}