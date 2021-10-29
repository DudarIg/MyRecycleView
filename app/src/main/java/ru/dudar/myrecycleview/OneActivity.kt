package ru.dudar.myrecycleview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

private const val EXTRA_NAME = "extra_name"
private const val EXTRA_COLOR = "extra_color"
private const val EXTRA_AGE = "extra_age"
private const val EXTRA_DATE = "extra_dat"


class OneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one_constr)

        val name = intent.getStringExtra(EXTRA_NAME)
        val color = intent.getStringExtra(EXTRA_COLOR)
        val age = intent.getStringExtra(EXTRA_AGE)
        val date = intent.getStringExtra(EXTRA_DATE)

        val nameTV: TextView = findViewById(R.id.name_tv)
        val colorTV: TextView = findViewById(R.id.color_tv)
        val ageTV: TextView = findViewById(R.id.age_tv)
        val dateTV: TextView = findViewById(R.id.date_tv)

        nameTV.text = name
        colorTV.text = color
        ageTV.text = age
        dateTV.text = date

    }

    companion object {
        fun newIntent(packContext: Context, name: String, color: String, age: String, dat: String): Intent {
            return Intent(packContext, OneActivity::class.java).apply {
                putExtra(EXTRA_NAME, name)
                putExtra(EXTRA_COLOR, color)
                putExtra(EXTRA_AGE, age)
                putExtra(EXTRA_DATE, dat)
            }
        }
    }
}