package com.anmol.anxietykiller

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class Exercise1 : AppCompatActivity() {




lateinit var videoView:VideoView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise1)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val offlineUri   = Uri.parse("android.resource://$packageName/${R.raw.e}")

    videoView.setMediaController(mediaController)
        videoView.setVideoURI(offlineUri)
        videoView.requestFocus()
        videoView.start()

    }
}



