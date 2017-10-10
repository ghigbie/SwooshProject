package com.example.georgehigbie.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.georgehigbie.swoosh.Model.Player
import com.example.georgehigbie.swoosh.R
import com.example.georgehigbie.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        fun setLoadingText(league: String, skillLevel: String){
            var displayText = "Searching for a ${player.league} ${player.skill} league near you!"
            loadingText.setText(displayText)
        }

        setLoadingText(player.league, player.skill)
    }
}
