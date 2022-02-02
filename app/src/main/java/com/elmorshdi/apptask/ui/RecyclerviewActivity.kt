package com.elmorshdi.apptask.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.elmorshdi.apptask.R
import com.elmorshdi.apptask.adapter.RecyclerviewAdapter

class RecyclerviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)
        val recyclerview = findViewById<RecyclerView>(R.id.simple_recyclerView)
        recyclerview.layoutManager = LinearLayoutManager(this)
        val adapter = RecyclerviewAdapter(getArrayList())
        recyclerview.adapter = adapter

    }

    private fun getArrayList(): ArrayList<String> {
        val data = ArrayList<String>()
        data.add("Mostafa")
        data.add("Mahmoud")
        data.add("Mohamed")
        data.add("Ahmed")
        data.add("Amira")
        data.add("Yousef")
        data.add("Nada")
        data.add("Khaled")
        data.add("Aya")
        data.add("Mostafa")
        return data
    }
}