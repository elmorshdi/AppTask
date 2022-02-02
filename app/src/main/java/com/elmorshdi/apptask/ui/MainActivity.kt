package com.elmorshdi.apptask.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.elmorshdi.apptask.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerviewButton = findViewById<Button>(R.id.simple_rv_button)
        recyclerviewButton.setOnClickListener {
            val intent = Intent(this, RecyclerviewActivity::class.java)
            startActivity(intent)
        }
    }
}