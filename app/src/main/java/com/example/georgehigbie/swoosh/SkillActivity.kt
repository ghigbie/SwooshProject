package com.example.georgehigbie.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league =  ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        var message = league+league+league
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

        var skillLevel = ""

        fun skillLevelToast(skillLevel: String){
            var toastMessage = "You have the selected the ${skillLevel} skill level."
            Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show()
        }

        beginnerButton.setOnClickListener {
            ballerButton.isChecked = false
            skillLevel = "beginner"
            skillLevelToast(skillLevel)
        }

        ballerButton.setOnClickListener {
            beginnerButton.isChecked = false
            skillLevel = "baller"
            skillLevelToast(skillLevel)
        }

        finishButton.setOnClickListener {
            if(skillLevel != ""){

            }else{
                var skillLevelMessage = "Please select a skill level."
                Toast.makeText(this, skillLevelMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
