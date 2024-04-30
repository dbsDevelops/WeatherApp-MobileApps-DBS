package com.example.weatherapp.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.weatherapp.databinding.ActivityAvailableCitiesBinding

class AvailableCitiesActivity : ComponentActivity() {

    private val view: ActivityAvailableCitiesBinding by lazy {
        ActivityAvailableCitiesBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

    }

    private fun setupListenersOnCitiesListView() {
        for ()
    }
}