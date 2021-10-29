package ru.dudar.myrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {




//    private val catsVM : CatsViewModel by lazy {
//        ViewModelProviders.of(this).get(CatsViewModel::class.java)
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val catsVM = ViewModelProvider(this).get(CatsViewModel::class.java)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MyAdapter(catsVM.cats, this)

    }

//    private fun fullList(): List<String> {
//        val data = mutableListOf<String>()
//        (0..30).forEach { i -> data.add("$i-й котенок") }
//        return data
//    }
}