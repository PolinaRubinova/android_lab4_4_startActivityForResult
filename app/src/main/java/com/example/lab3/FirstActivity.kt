package com.example.lab3

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivityFirstBinding

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toSecond.setOnClickListener { toSecond() }
        binding.toAbout.setOnNavigationItemSelectedListener  { toAbout(it) }

    }

    private fun toSecond() {
        startActivity(Intent(this, SecondActivity::class.java))
    }

    private fun toAbout(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                startActivity(Intent(this, AboutActivity::class.java))
            }
        }
        return false
    }
}