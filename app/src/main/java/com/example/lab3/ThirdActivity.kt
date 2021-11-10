package com.example.lab3

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bnToFirst.setOnClickListener {
            setResult(1)
            finish()
        }
        binding.bnToSecond.setOnClickListener { finish() }
        binding.navView.setOnItemSelectedListener { toAbout(it) }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun toAbout(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_about -> {
                startActivity(Intent(this, AboutActivity::class.java))
            }
        }
        return false
    }
}