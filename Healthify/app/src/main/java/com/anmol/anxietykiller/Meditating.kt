package com.anmol.anxietykiller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Meditating : AppCompatActivity() {

    lateinit var musicmeditatebtn :Button
    lateinit var bodymeditatebtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meditating)

        musicmeditatebtn = findViewById(R.id.meditatebutton2)
        bodymeditatebtn = findViewById(R.id.meditatebutton1)

        musicmeditatebtn.setOnClickListener {

            val intent = Intent(this@Meditating, Musicmeditation2::class.java)
            startActivity(intent)
        }
        bodymeditatebtn.setOnClickListener {

            val intent = Intent(this@Meditating, Bodymeditation::class.java)
            startActivity(intent)
        }

  }
}