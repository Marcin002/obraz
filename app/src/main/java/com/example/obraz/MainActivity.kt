package com.example.obraz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.przycisk).setOnClickListener {
            findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.czerwomy)
        }
        findViewById<Button>(R.id.przyciskk).setOnClickListener {
            findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid)
        }
        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.siid)
        }
    }
}