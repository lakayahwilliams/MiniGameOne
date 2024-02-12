package com.williams.minigameone

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

        internal lateinit var clickMeButton: Button
        internal lateinit var scoreView: TextView
        internal lateinit var potView: ImageView
        internal var score = 0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickMeButton = findViewById(R.id.clickMeButton)
        scoreView = findViewById(R.id.scoreView)
        potView = findViewById(R.id.potView)

        clickMeButton.setOnClickListener {
            score += 1
            scoreView.text = score.toString()
            if (score == 10) {
                Toast.makeText(this,getString(R.string.you_win), Toast.LENGTH_LONG).show()
                potView.setImageResource(R.drawable.flower)
            }
        }
        fun getFlower(): Int {
            return when (score) {
             0 -> R.drawable.pot
             1 -> R.drawable.pot
                2 -> R.drawable.pot
                3 -> R.drawable.pot
                4 -> R.drawable.pot
                5 -> R.drawable.pot
                6 -> R.drawable.pot
                7 -> R.drawable.pot
                8 -> R.drawable.pot
                9 -> R.drawable.pot
                else -> R.drawable.flower

            }
        }
    }
}
