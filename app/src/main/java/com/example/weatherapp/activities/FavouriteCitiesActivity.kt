package com.example.weatherapp.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.weatherapp.databinding.ActivityFavouriteCitiesBinding

class FavouriteCitiesActivity : ComponentActivity() {

    private val view: ActivityFavouriteCitiesBinding by lazy {
        ActivityFavouriteCitiesBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)
    }
}