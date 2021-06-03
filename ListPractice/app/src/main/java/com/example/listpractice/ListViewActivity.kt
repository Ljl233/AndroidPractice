package com.example.listpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {

    val data = arrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)
        //不能再onCreate前
        val arrayAdapter = ArrayAdapter<Int>(this, android.R.layout.simple_list_item_1, data)
        val listView = findViewById<ListView>(R.id.list_view)
        listView.adapter = arrayAdapter
    }

}