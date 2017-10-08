package com.example.georgehigbie.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        var selectedLeague = ""


        fun toastLeagueSelection(selectedLeague: String){
            var toastMessage = "You selected the ${selectedLeague} league!!!"
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }

        mensButton.setOnClickListener {
            womensButton.isChecked = false
            coedButton.isChecked = false
            selectedLeague = "Mens"
            toastLeagueSelection(selectedLeague)
        }

        womensButton.setOnClickListener {
            mensButton.isChecked = false
            coedButton.isChecked = false
            selectedLeague = "Womens"
            toastLeagueSelection(selectedLeague)
        }

        coedButton.setOnClickListener {
            mensButton.isChecked = false
            womensButton.isChecked = false
            selectedLeague = "Coed"
            toastLeagueSelection(selectedLeague)
        }


        nextButton.setOnClickListener {
            if(selectedLeague != "") {
                val skillIntent = Intent(this, SkillActivity::class.java)
                startActivity(skillIntent)
            }else{
                var needSelectionMessage = "Please select a league"
                Toast.makeText(this, needSelectionMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
