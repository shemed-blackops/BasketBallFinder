package com.blackops.basketballfinder.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.blackops.basketballfinder.R
import com.blackops.basketballfinder.Utilities.EXTRA_LEAGUE
import com.blackops.basketballfinder.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
//        Toast.makeText(this, league, Toast.LENGTH_SHORT).show()
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        skill = "beginner"

        mySkillText.text = "${getString(R.string.my_skill)} a $skill"


    }
    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        skill = "baller"
        mySkillText.text = "${getString(R.string.my_skill)} $skill"
    }
    fun onSkillFinishClicked(view: View) {
        if(skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java )
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        }
        else{
            Toast.makeText(this, "Please select skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
