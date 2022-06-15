package com.anmol.anxietykiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sessionpage3 : AppCompatActivity() {
    lateinit var sessionbutton3 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sessionpage3)

        sessionbutton3 = findViewById(R.id.sessionbutton3)

        sessionbutton3.setOnClickListener {

            val intent = Intent(this@sessionpage3, Sessionpage4::class.java)
            startActivity(intent)
        }

    }
}