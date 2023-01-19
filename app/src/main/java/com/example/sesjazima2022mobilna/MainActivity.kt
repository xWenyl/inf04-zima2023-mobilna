package com.example.sesjazima2022mobilna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    val list = arrayListOf<String>("Zakupy: chleb, masło, ser",
        "Do zrobienia: obiad, umyc podłogi",
        "weekend: kino, spacer z psem")
    lateinit var adapter: ArrayAdapter<String>
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listviewTODO)
        adapter = ArrayAdapter(this, R.layout.list_item, list)
        listView.adapter = adapter
    }

    fun dodajTODO(view: View) {
        var userinput = findViewById<EditText>(R.id.userinput).text.toString()
        list.add(userinput)
        adapter.notifyDataSetChanged()
    }
}