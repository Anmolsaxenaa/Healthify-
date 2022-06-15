package com.anmol.anxietykiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sessionpage5 : AppCompatActivity() {


    lateinit var  returnmainmenu : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sessionpage5)


        returnmainmenu = findViewById(R.id.returnmainmenu)


        returnmainmenu.setOnClickListener {

            val intent = Intent(this@Sessionpage5, buttons::class.java)
            startActivity(intent)
        }


    }
}