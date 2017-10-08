package com.example.georgehigbie.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.georgehigbie.swoosh.R
import com.example.georgehigbie.swoosh.Utilities.EXTRA_LEAGUE
import com.example.georgehigbie.swoosh.Utilities.EXTRA_SKILL

class FinishActivity : AppCompatActivity() {

    var league = ""
    var skillLevel = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        skillLevel = intent.getStringExtra(EXTRA_SKILL)

    }
}
