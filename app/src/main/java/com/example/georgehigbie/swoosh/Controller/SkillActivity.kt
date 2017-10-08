package com.example.georgehigbie.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import com.example.georgehigbie.swoosh.Utilities.EXTRA_LEAGUE
import com.example.georgehigbie.swoosh.R
import com.example.georgehigbie.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league =  ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)

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
                var finishIntent = Intent(this, FinishActivity::class.java)
                finishIntent.putExtra(EXTRA_LEAGUE, league)
                finishIntent.putExtra(EXTRA_SKILL, skillLevel)
                startActivity(finishIntent)
            }else{
                var skillLevelMessage = "Please select a skill level."
                Toast.makeText(this, skillLevelMessage, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
