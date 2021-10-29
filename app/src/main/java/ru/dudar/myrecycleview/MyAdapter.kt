package ru.dudar.myrecycleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.dudar.myrecycleview.tools.tools

class MyAdapter(private val cats: List<Cat>, private val myContext: Context):
                                RecyclerView.Adapter<MyAdapter.MyHolder>() {

    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val text1: TextView = itemView.findViewById(R.id.text_view1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false))
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val cat = cats[position]
        holder.text1.text = cat.name
        val age = "${cat.age} ${tools.god(cat.age)}"
        holder.itemView.setOnClickListener {
            val intent = OneActivity.newIntent(myContext, cat.name, cat.color, age, tools.getDateToString(cat.date) )
            myContext.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return cats.size
    }



}