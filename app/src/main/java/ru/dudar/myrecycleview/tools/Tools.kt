package ru.dudar.myrecycleview.tools

import java.text.SimpleDateFormat
import java.util.*

object Tools {

    fun god(g : Int) : String {
        when (g) {
            1 ->  return "год"
            in 2..4 -> return  "года"
            in 5..12 -> return "лет"
        }
        return "нет данных"
    }

    fun getDateToString(): String{
        val formatter = SimpleDateFormat("dd-MM-yy kk:mm", Locale.getDefault())
        return formatter.format(Calendar.getInstance().time)
    }

}