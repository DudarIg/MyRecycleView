package ru.dudar.myrecycleview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import ru.dudar.myrecycleview.databinding.ActivityMainBinding
import ru.dudar.myrecycleview.databinding.ActivityOneConstrBinding

private const val EXTRA_NAME = "extra_name"
private const val EXTRA_COLOR = "extra_color"
private const val EXTRA_AGE = "extra_age"
private const val EXTRA_DATE = "extra_dat"


class OneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOneConstrBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOneConstrBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(EXTRA_NAME)
        val color = intent.getStringExtra(EXTRA_COLOR)
        val age = intent.getStringExtra(EXTRA_AGE)
        val date = intent.getStringExtra(EXTRA_DATE)

        binding.apply {
            nameTv.text = name
            colorTv.text = color
            ageTv.text = age
        }
        binding.dateTv.text = date
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