package ru.dudar.myrecycleview

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import java.security.AccessController.getContext
import java.text.SimpleDateFormat
import java.util.*

class MyAdapter(val cats: List<Cat>, val myContext: Context):
                                RecyclerView.Adapter<MyAdapter.MyHolder>() {

    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val text1: TextView = itemView.findViewById(R.id.text_view1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val itemview = LayoutInflater.from(parent.context)
            .inflate(R.layout.recyclerview_item, parent, false)
        return MyHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val cat = cats[position]
        holder.text1.text = cat.name
        val age = "${cat.age.toString()} ${god(cat.age)}"
        holder.itemView.setOnClickListener {
            val intent = OneActivity.newIntent(myContext, cat.name, cat.color, age, getDateToString(cat.date) )
            myContext.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return cats.size
    }

    fun god(g : Int) : String {
        when (g) {
            1 ->  return "год"
            in 2..4 -> return  "года"
            in 5..12 -> return "лет"
        }
        return "нет данных"
    }

    fun getDateToString(data : Date): String{
        //val dtime = Calendar.getInstance().time
        val formatter = SimpleDateFormat("dd-MM-yy kk:mm", Locale.getDefault())
        return formatter.format(data)

    }


}