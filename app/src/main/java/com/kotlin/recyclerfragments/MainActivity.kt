package com.kotlin.recyclerfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnNext)
        button.setOnClickListener {
            val i = Intent(this, HomeFragment::class.java)
            startActivity(i)
        }
    }

}