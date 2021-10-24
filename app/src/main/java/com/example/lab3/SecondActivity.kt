package com.example.lab3

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toFirst.setOnClickListener { finish() }
        binding.toThird.setOnClickListener { toThird() }
        binding.toAbout.setOnNavigationItemSelectedListener  { toAbout(it) }
    }

    private fun toThird() {
        startActivityForResult(Intent(this, ThirdActivity::class.java), 0)
    }

    private fun toAbout(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.about -> {
                startActivity(Intent(this, AboutActivity::class.java))
            }
        }
        return false
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == 1) { finish() }
    }
}