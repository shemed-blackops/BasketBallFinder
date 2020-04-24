package com.blackops.basketballfinder.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blackops.basketballfinder.Model.Player
import com.blackops.basketballfinder.R
import com.blackops.basketballfinder.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

        lateinit var player : Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player = intent.getParcelableExtra(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for ${player.league} ${player.skill} team near you"
    }
}
