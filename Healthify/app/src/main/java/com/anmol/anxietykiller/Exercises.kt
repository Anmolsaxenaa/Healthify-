package com.anmol.anxietykiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Exercises : AppCompatActivity() {

    lateinit var  exercisepagebtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercises)

        exercisepagebtn =findViewById(R.id.exercisepagebtn)

        exercisepagebtn.setOnClickListener {

            val intent = Intent(this@Exercises, Exercise1::class.java)
            startActivity(intent)
        }
    }
}