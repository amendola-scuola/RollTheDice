package com.example.rollthedice

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val numEstratto = intent.getIntExtra("NUMERO", -1)
        val textViewTitle = findViewById<TextView>(R.id.second_activity_title)
        textViewTitle.text = "${textViewTitle.text} $numEstratto"

        val imageViewSecond = findViewById<ImageView>(R.id.second_activity_image)
        /*
        imageViewSecond.setImageResource(
            resources.getIdentifier("dice_face_$numEstratto",
            "drawable",
            packageName))
        */
        var resource = when(numEstratto) {
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            6 -> R.drawable.dice_face_6
            else -> {R.drawable.dices}
        }
        imageViewSecond.setImageResource(resource)
    }
}