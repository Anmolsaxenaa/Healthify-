package com.anmol.anxietykiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sessionpage4 : AppCompatActivity() {
    lateinit var sessionbutton4 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sessionpage4)

        sessionbutton4 = findViewById(R.id.sessionbutton4)

        sessionbutton4.setOnClickListener {

            val intent = Intent(this@Sessionpage4, Sessionpage5::class.java)
            startActivity(intent)
        }
    }

}