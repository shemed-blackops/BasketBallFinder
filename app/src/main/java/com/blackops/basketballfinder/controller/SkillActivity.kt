package com.blackops.basketballfinder.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.blackops.basketballfinder.Model.Player
import com.blackops.basketballfinder.R
import com.blackops.basketballfinder.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
//        Toast.makeText(this, league, Toast.LENGTH_SHORT).show()
    }

    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"

        mySkillText.text = "${getString(R.string.my_skill)} a ${player.skill}"


    }
    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
        mySkillText.text = "${getString(R.string.my_skill)} ${player.skill}"
    }
    fun onSkillFinishClicked(view: View) {
        if( player.skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java )
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }
        else{
            Toast.makeText(this, "Please select skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
