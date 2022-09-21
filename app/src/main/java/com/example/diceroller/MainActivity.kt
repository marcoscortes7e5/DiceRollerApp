package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val rollTheDiceBoton = findViewById<Button>(R.id.rollTheDiceButton)
        rollTheDiceBoton.setBackgroundColor(0xC69593)
            val backTo0Boton = findViewById<Button>(R.id.backTo0Button)
        backTo0Boton.setBackgroundColor(0xC69593)
            var diceImage = findViewById<ImageView>(R.id.dice)
            var diceImage2 = findViewById<ImageView>(R.id.dice2)
            val listOfDice = listOf(R.drawable.dice_1,
                R.drawable.dice_2,
                R.drawable.dice_3,
                R.drawable.dice_4,
                R.drawable.dice_5,
                R.drawable.dice_6)
        fun isJackpot(randomNumber: Int, randomNumber2: Int){
            if (randomNumber==5 && randomNumber2==5){
                Toast.makeText(applicationContext, "JACKPOT!", Toast.LENGTH_LONG).show()
            }
        }
        rollTheDiceBoton.setOnClickListener {
            val randomNumber = (0..5).random()
            val randomNumber2 = (0..5).random()
            diceImage.setImageResource(listOfDice[randomNumber])
            diceImage2.setImageResource(listOfDice[randomNumber2])
            isJackpot(randomNumber, randomNumber2)
        }
        backTo0Boton.setOnClickListener {
            diceImage.setImageResource(R.drawable.empty_dice)
            diceImage2.setImageResource(R.drawable.empty_dice)
        }
        diceImage.setOnClickListener{
            val randomNumber = (0..5).random()
            diceImage.setImageResource(listOfDice[randomNumber])
        }
        diceImage2.setOnClickListener{
            val randomNumber = (0..5).random()
            diceImage2.setImageResource(listOfDice[randomNumber])
        }

    }
}