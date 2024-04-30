package com.example.weatherapp.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.weatherapp.databinding.ActivityCityDetailBinding

class CityDetailActivity : ComponentActivity() {

    private val view: ActivityCityDetailBinding by lazy {
        ActivityCityDetailBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)

    }
}