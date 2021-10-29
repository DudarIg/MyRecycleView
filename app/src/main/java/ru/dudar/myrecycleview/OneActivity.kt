package ru.dudar.myrecycleview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private const val EXTRA_NAME = "extra_name"
private const val EXTRA_COLOR = "extra_color"
private const val EXTRA_AGE = "extra_age"


class OneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_one)

        val name = intent.getStringExtra(EXTRA_NAME)
        val color = intent.getStringExtra(EXTRA_COLOR)
        val age = intent.getStringExtra(EXTRA_AGE)

        val nameTV: TextView = findViewById(R.id.name_tv)
        val colorTV: TextView = findViewById(R.id.color_tv)
        val ageTV: TextView = findViewById(R.id.age_tv)

        nameTV.text = name
        colorTV.text = color
        ageTV.text = age

    }


    companion object {
        fun newIntent(packContext: Context, name: String, color: String, age: String): Intent {
            return Intent(packContext, OneActivity::class.java).apply {
                putExtra(EXTRA_NAME, name)
                putExtra(EXTRA_COLOR, color)
                putExtra(EXTRA_AGE, age)
            }
        }
    }
}