package ru.dudar.myrecycleview

import java.io.Serializable
import java.util.*

data class Cat(
    val id: UUID = UUID.randomUUID(),
    var name: String ="",
    var color: String = "",
    var age: Int = 0,
    var date: String =""
) : Serializable