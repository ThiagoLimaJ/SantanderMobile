package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnExibir.setOnClickListener{
            //val intent = Intent(this, NovaTela:class.java)

            Toast.makeText(this, "Olá", Toast.LENGTH_SHORT).show()
        }
    }
}