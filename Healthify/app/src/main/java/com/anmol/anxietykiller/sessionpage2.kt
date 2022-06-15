package com.anmol.anxietykiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sessionpage2 : AppCompatActivity() {

    lateinit var sessionbutton2 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sessionpage2)

        sessionbutton2 = findViewById(R.id.sessionbutton2)
        sessionbutton2.setOnClickListener {

            val intent = Intent(this@sessionpage2, sessionpage3::class.java)
            startActivity(intent)
        }


    }
}