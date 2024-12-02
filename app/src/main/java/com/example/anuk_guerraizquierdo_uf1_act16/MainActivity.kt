package com.example.anuk_guerraizquierdo_uf1_act16

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the buttons
        val buttonGreen = findViewById<Button>(R.id.buttonGreen)
        val buttonRed = findViewById<Button>(R.id.buttonRed)
        val buttonBlue = findViewById<Button>(R.id.buttonBlue)

        // Set click listeners for each button
        buttonGreen.setOnClickListener {
            val intent = Intent(this, Green::class.java)
            startActivity(intent)
        }

        buttonRed.setOnClickListener {
            val intent = Intent(this, Red::class.java)
            startActivity(intent)
        }

        buttonBlue.setOnClickListener {
            val intent = Intent(this, Blue::class.java)
            startActivity(intent)
        }
    }
}
