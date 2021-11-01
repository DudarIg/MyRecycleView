package ru.dudar.myrecycleview

import androidx.lifecycle.ViewModel
import java.util.*
import kotlin.random.Random

class CatsViewModel: ViewModel() {

    val cats = mutableListOf<Cat>()

    init {
        val col = listOf("Белый", "Серый", "Черный", "Рыжий")
        val names = listOf("Барсик", "Мурзик","Васька","Малыш","Черныш","Рыжик","Принц","Борис")
        val dates = listOf("01-01-19","21-04-20","11-12-20","31-03-18","01-05-20","16-05-20","30-09-19","18-06-17")

        for (i in 0 until 100) {
            val cat = Cat()
            //cat.id = UUID.randomUUID()
            cat.name = names.random()
            cat.age = Random.nextInt(12)+1
            cat.color = col.random()
            cat.date = dates.random()
            cats.add(cat)
        }
    }
}