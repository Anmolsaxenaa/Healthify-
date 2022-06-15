package com.anmol.anxietykiller

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Musicmeditation2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musicmeditation)

        var meditatebutton11 = findViewById<Button>(R.id.meditatebutton11)
        var meditatebutton12 = findViewById<Button>(R.id.meditatebutton12)
        var meditatebutton13 = findViewById<Button>(R.id.meditatebutton13)
        var meditatebutton14 = findViewById<Button>(R.id.meditatebutton14)
        var stopButton = findViewById<Button>(R.id.stopButton)
        var mp=MediaPlayer()
        meditatebutton11.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.sound1))
            mp.prepare()
            mp.start()
        }
        meditatebutton12.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.sound2))
            mp.prepare()
            mp.start()
        }
        meditatebutton13.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.sound3))
            mp.prepare()
            mp.start()
        }
        meditatebutton14.setOnClickListener {
            mp.setDataSource(this, Uri.parse("android.resource://"+this.packageName+"/"+R.raw.sound4))
            mp.prepare()
            mp.start()
        }

        stopButton.setOnClickListener {
            mp.stop()
            mp.release()
            mp= MediaPlayer()

        }









    }


}