package com.example.georgehigbie.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.georgehigbie.swoosh.Model.Player
import com.example.georgehigbie.swoosh.Utilities.EXTRA_LEAGUE
import com.example.georgehigbie.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        var player = Player("", "")

        fun toastLeagueSelection(selectedLeague: String){
            var toastMessage = "You selected the ${selectedLeague} league!!!"
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }

        mensButton.setOnClickListener {
            womensButton.isChecked = false
            coedButton.isChecked = false
            player.leauge = "mens"
            toastLeagueSelection(player.leauge)
        }

        womensButton.setOnClickListener {
            mensButton.isChecked = false
            coedButton.isChecked = false
            player.leauge = "womens"
            toastLeagueSelection(player.leauge)
        }

        coedButton.setOnClickListener {
            mensButton.isChecked = false
            womensButton.isChecked = false
            player.leauge = "co-ed"
            toastLeagueSelection(player.leauge)
        }


        nextButton.setOnClickListener {
            if(player.leauge != "") {
                val skillIntent = Intent(this, SkillActivity::class.java)
                skillIntent.putExtra(EXTRA_LEAGUE, player.leauge)
                startActivity(skillIntent)
            }else{
                var needSelectionMessage = "Please select a league"
                Toast.makeText(this, needSelectionMessage, Toast.LENGTH_SHORT).show()
            }
        }

    }
}
