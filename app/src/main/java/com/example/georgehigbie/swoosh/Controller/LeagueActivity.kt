package com.example.georgehigbie.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.georgehigbie.swoosh.Model.Player
import com.example.georgehigbie.swoosh.R
import com.example.georgehigbie.swoosh.Utilities.EXTRA_PLAYER
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
            player.league = "mens"
            toastLeagueSelection(player.league)
        }

        womensButton.setOnClickListener {
            mensButton.isChecked = false
            coedButton.isChecked = false
            player.league = "womens"
            toastLeagueSelection(player.league)
        }

        coedButton.setOnClickListener {
            mensButton.isChecked = false
            womensButton.isChecked = false
            player.league = "co-ed"
            toastLeagueSelection(player.league)
        }


        nextButton.setOnClickListener {
            if(player.league != "") {
                val skillIntent = Intent(this, SkillActivity::class.java)
                skillIntent.putExtra(EXTRA_PLAYER, player.league)
                startActivity(skillIntent)
            }else{
                var needSelectionMessage = "Please select a league"
                Toast.makeText(this, needSelectionMessage, Toast.LENGTH_SHORT).show()
            }
        }

    }
}
