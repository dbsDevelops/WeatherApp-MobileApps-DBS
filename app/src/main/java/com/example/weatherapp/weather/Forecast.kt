package com.example.weatherapp.weather

data class Forecast(var city: String, var dateTime: String, var temperature: Int, var maximumTemperature: Int,
                    var minimumTemperature: Int, var icon: String) {


}