package com.example.accaver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.accaver.adapter.ItemAdapter
import com.example.accaver.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize data
        val myDataSet = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

        recyclerView.adapter = ItemAdapter(this, myDataSet)

        recyclerView.setHasFixedSize(true)
    }
}