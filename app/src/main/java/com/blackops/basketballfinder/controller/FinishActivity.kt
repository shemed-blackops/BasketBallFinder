package com.blackops.basketballfinder.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blackops.basketballfinder.R
import com.blackops.basketballfinder.Utilities.EXTRA_LEAGUE
import com.blackops.basketballfinder.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeagueText.text = "Looking for $league $skill team near you"
    }
}
