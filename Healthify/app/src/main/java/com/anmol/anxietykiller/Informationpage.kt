package com.anmol.anxietykiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Informationpage : AppCompatActivity() {

    lateinit var  continuebtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informationpage)

        continuebtn = findViewById(R.id.continueBtn)


        continuebtn.setOnClickListener {

            val intent = Intent(this@Informationpage, buttons::class.java)
            startActivity(intent)
        }
    }
}