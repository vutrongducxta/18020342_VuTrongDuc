package com.example.lession1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.RandomAccess
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var ketquaImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nut_xoay: Button = findViewById(R.id.nut_xoay)
        nut_xoay.text="hãy xoay đi nào"
        nut_xoay.setOnClickListener {
           daXoay()
        }
        ketquaImage= findViewById(R.id.xúc_xắc)

    }

    private fun daXoay() {

        val ketquaxoay = java.util.Random().nextInt(6)+1
        val drawableResource = when (ketquaxoay){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5->R.drawable.dice_5
            else ->R.drawable.dice_6
        }
        ketquaImage.setImageResource(drawableResource)

    }
}