package ru.dudar.myrecycleview

import java.util.*

data class Cat(
    val id: UUID = UUID.randomUUID(),
    var name: String = "",
    var color: String = "",
    var age: Int = 0)
