package com.anmol.anxietykiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class buttons : AppCompatActivity() {

    lateinit var sessionbutton : Button
    lateinit var meditatebtn : Button
    lateinit var exercisebtn : Button
    lateinit var pharmabtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        sessionbutton = findViewById(R.id.sessionbtn)
        meditatebtn = findViewById(R.id.meditatebtn)
        exercisebtn = findViewById(R.id.exercisebtn)
        pharmabtn = findViewById(R.id.pharmabtn)



        sessionbutton.setOnClickListener {

            val intent = Intent(this@buttons, Sessionpage1::class.java)
            startActivity(intent)
        }


        meditatebtn.setOnClickListener {

            val intent = Intent(this@buttons, Meditating::class.java)
            startActivity(intent)
        }


        exercisebtn.setOnClickListener {

            val intent = Intent(this@buttons, Exercises::class.java)
            startActivity(intent)
        }


        pharmabtn.setOnClickListener {

            val intent = Intent(this@buttons, pharma::class.java)
            startActivity(intent)
        }



    }
}