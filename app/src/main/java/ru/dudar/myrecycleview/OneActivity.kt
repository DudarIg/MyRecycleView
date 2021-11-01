package ru.dudar.myrecycleview

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import ru.dudar.myrecycleview.databinding.ActivityMainBinding
import ru.dudar.myrecycleview.databinding.ActivityOneConstrBinding

private const val EXTRA_CAT = "extra_cat"

class OneActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOneConstrBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOneConstrBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cat = intent.getSerializableExtra("EXTRA_CAT") as Cat

        binding.apply {
            nameTv.text = cat.name
            colorTv.text = cat.color
            ageTv.text = cat.age.toString()
        }
        binding.dateTv.text = cat.date
    }

    companion object {
        fun newIntent(packContext: Context, cat : Cat): Intent {
            return Intent(packContext, OneActivity::class.java).apply {
            putExtra(EXTRA_CAT, cat )

            }
        }
    }
}