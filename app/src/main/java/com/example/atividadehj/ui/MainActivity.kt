package com.example.atividadehj.ui

import android.os.Bundle
import com.example.atividadehj.R
import androidx.appcompat.app.AppCompatActivity
import com.example.atividadehj.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnUsers.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, UserListFragment())
                .addToBackStack(null)
                .commit()
        }

        binding.btnProducts.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, ProductListFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}
