package com.anmol.anxietykiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class pharma : AppCompatActivity() {

    lateinit var  pharmapagebutton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pharma)

        pharmapagebutton = findViewById(R.id.pharmapagebtn)
        pharmapagebutton.setOnClickListener {

            val intent = Intent(this@pharma, pharmapage2::class.java)
            startActivity(intent)
        }
    }



}