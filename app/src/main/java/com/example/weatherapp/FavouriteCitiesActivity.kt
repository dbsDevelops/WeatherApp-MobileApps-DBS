package com.example.weatherapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapp.databinding.ActivityFavouriteCitiesBinding

class FavouriteCitiesActivity : AppCompatActivity() {

    private val view: ActivityFavouriteCitiesBinding by lazy {
        ActivityFavouriteCitiesBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(view.root)


    }
}