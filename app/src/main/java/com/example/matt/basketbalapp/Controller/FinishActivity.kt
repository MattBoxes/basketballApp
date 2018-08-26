package com.example.matt.basketbalapp.Controller

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.matt.basketbalapp.R
import com.example.matt.basketbalapp.Utilities.EXTRA_LEAGUE
import com.example.matt.basketbalapp.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league =  intent.getStringExtra(EXTRA_LEAGUE)
        val skill =  intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for a $league $skill league near you..."
    }
}
