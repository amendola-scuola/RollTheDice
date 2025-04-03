package com.example.rollthedice5bi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnRoll = findViewById<Button>(R.id.buttonRoll)
        btnRoll.setOnClickListener(View.OnClickListener {
            var mioRandom = (1..6).random()
            var mioToast = Toast.makeText(this,
                "NUMERO ESTRATTO: $mioRandom",
                Toast.LENGTH_SHORT)
            mioToast.show()
        })
    }
}