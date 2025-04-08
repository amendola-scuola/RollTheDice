package com.example.rollthedice5bi

import android.os.Bundle
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
    }
}