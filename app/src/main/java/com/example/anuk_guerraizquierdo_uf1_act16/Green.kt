package com.example.anuk_guerraizquierdo_uf1_act16

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Green : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_green)

        val buttonReturn = findViewById<Button>(R.id.buttonReturn)
        buttonReturn.setOnClickListener {
            finish()
        }
    }
}