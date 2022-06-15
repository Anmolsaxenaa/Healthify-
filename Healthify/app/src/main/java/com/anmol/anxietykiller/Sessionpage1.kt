package com.anmol.anxietykiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sessionpage1 : AppCompatActivity() {

    lateinit var sessionbutton1 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sessionpage1)

        sessionbutton1 = findViewById(R.id.sessionbutton1)


        sessionbutton1.setOnClickListener {

            val intent = Intent(this@Sessionpage1, sessionpage2::class.java)
            startActivity(intent)
        }

    }
}