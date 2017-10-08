package com.example.georgehigbie.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        var selectedLeague = ""

        mensButton.setOnClickListener {
            womensButton.isChecked = false
            coedButton.isChecked = false
            selectedLeague = "mens"
        }

        womensButton.setOnClickListener {
            mensButton.isChecked = false
            coedButton.isChecked = false
            selectedLeague = "womens"
        }

        coedButton.setOnClickListener {
            mensButton.isChecked = false
            womensButton.isChecked = false
            selectedLeague = "coed"
        }

        nextButton.setOnClickListener {
            val skillIntent = Intent(this, SkillActivity::class.java)
            startActivity(skillIntent)
        }
    }
}
