package com.example.meunome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

const val ERROR_TEXT = "Favor inserir um nome"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExibir.setOnClickListener{
           val resultado = etNome.text.toString()

           if(resultado.isNotEmpty()) {
               tvResultado.text = resultado

               tvResultado.visibility = View.VISIBLE
               tvNome.visibility = View.VISIBLE
           } else{
               etNome.error = ERROR_TEXT
           }

            btnRestart.setOnClickListener {
                tvNome.visibility = View.GONE
                tvResultado.visibility = View.GONE
            }

        }
    }
}