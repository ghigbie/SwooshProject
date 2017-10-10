package com.example.georgehigbie.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.georgehigbie.swoosh.Model.Player
import com.example.georgehigbie.swoosh.R
import com.example.georgehigbie.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)


        fun skillLevelToast(skillLevel: String){
            var toastMessage = "You have the selected the ${skillLevel} skill level."
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }

        beginnerButton.setOnClickListener {
            ballerButton.isChecked = false
            player.skill = "beginner"
            skillLevelToast(player.skill)
        }

        ballerButton.setOnClickListener {
            beginnerButton.isChecked = false
            player.skill = "baller"
            skillLevelToast(player.skill)
        }

        finishButton.setOnClickListener {
            if(player.skill != ""){
                var finishIntent = Intent(this, FinishActivity::class.java)
                finishIntent.putExtra(EXTRA_PLAYER, player)
                startActivity(finishIntent)
            }else{
                var skillLevelMessage = "Please select a skill level."
                Toast.makeText(this, skillLevelMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
