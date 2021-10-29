package ru.dudar.myrecycleview

import androidx.lifecycle.ViewModel
import kotlin.random.Random

class CatsViewModel: ViewModel() {

    val cats = mutableListOf<Cat>()

    init {
        val col = listOf("Белый", "Серый", "Черный", "Рыжий")
        val names = listOf("Барсик", "Мурзик","Васька","Малыш","Черныш","Рыжик","Принц","Борис")
        for (i in 0 until 100) {
            val cat = Cat()
            cat.name = names.random()
            cat.age = Random.nextInt(12)+1
            cat.color = col.random()
            cats.add(cat)
        }
    }
}