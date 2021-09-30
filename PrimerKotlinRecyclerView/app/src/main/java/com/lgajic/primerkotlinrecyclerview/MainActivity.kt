package com.lgajic.primerkotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lgajic.primerkotlinrecyclerview.adapter.ContactListAdapter
import com.lgajic.primerkotlinrecyclerview.api.InMemoryAPI

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ContactListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
    }

    private fun initComponents() {
        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)

        adapter = ContactListAdapter(InMemoryAPI.getContacts())
        recyclerView.adapter = adapter
    }


}