package com.example.listpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {

    val data = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        with(findViewById<RecyclerView>(R.id.recycler_view)) {
            layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
            adapter = RVAdapter(data)
        }

    }
}