package com.example.weatherapp.weather

import android.app.Activity
import android.widget.ArrayAdapter
import com.example.weatherapp.R

class WeatherAdapter(private val context: Activity,
                     private val forecastList: ArrayList<Forecast>): ArrayAdapter<Forecast>(context,
                         R.layout.activity_city_detail, forecastList) {

}