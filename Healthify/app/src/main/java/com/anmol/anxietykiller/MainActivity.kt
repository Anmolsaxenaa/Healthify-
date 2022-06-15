package com.anmol.anxietykiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView;

class MainActivity : AppCompatActivity() {

    lateinit var welcomepagebtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = " Depression and Anxiety Killer"

        welcomepagebtn =findViewById(R.id.welcomepagebtn)

        welcomepagebtn.setOnClickListener {

            val intent = Intent(this@MainActivity, Informationpage::class.java)
            startActivity(intent)
        }


    }
}