package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var timesClicked = 0
        // set on-click listener
        button.setOnClickListener {
            timesClicked += 1;
            textView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Hi! Roshan Raut.", Toast.LENGTH_SHORT).show()
        }

    }
}
