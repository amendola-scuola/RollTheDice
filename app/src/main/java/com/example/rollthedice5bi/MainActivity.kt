package com.example.rollthedice5bi

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var diceFaces: HashMap<Int, Int>
    lateinit var imageViewDice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnRoll = findViewById<Button>(R.id.buttonRoll)

        btnRoll.setOnClickListener(View.OnClickListener {
            messaggioToast("DADI LANCIATI!")

            var mioRandom = estraiNumero()
            messaggioToast("ESTRATTO NUMERO $mioRandom!")

            loadFaces()
            setImage(mioRandom)
            lanciaIntent(mioRandom)
        })
    }

    private fun messaggioToast(msg: String) {
        var mioToast = Toast.makeText(
            this,
            msg,
            Toast.LENGTH_SHORT
        )
        mioToast.show()
    }

    private fun loadFaces() {
        diceFaces = HashMap()
        for (i in 1..6) {
            diceFaces.put(i, resources.getIdentifier("dice_face_$i", "drawable", packageName))
        }
    }

    private fun estraiNumero(): Int {
        return (1..6).random()
    }

    private fun lanciaIntent(mioRandom: Int) {
        var mioIntent = Intent(this, SecondActivity::class.java)
        mioIntent.putExtra("NUMERO", mioRandom)
        startActivity(mioIntent)
    }

    private fun setImage(mioRandom: Int) {
        imageViewDice = findViewById(R.id.imageViewDice)
        imageViewDice.setImageResource(diceFaces.get(mioRandom)!!)
    }
}