package com.example.weatherapp.weather

import androidx.annotation.DrawableRes
import com.example.weatherapp.R

sealed class WeatherType(
    val weatherIcon: String,
    @DrawableRes val weatherIconRes: Int) {

    object ClearDay : WeatherType("clear-day", R.drawable.clear_day)
    object ClearNight : WeatherType("clear-night", R.drawable.clear_night)
    object Cloudy : WeatherType("cloudy", R.drawable.cloudy)
    object Fog : WeatherType("fog", R.drawable.fog)
    object Hail : WeatherType("hail", R.drawable.hail)
    object PartlyCloudyDay : WeatherType("partly-cloudy-day", R.drawable.partly_cloudy_day)
    object PartlyCloudyNight : WeatherType("partly-cloudy-night", R.drawable.partly_cloudy_night)
    object Rain : WeatherType("rain", R.drawable.rain)
    object RainSnow : WeatherType("rain-snow", R.drawable.rain_snow)
    object RainSnowShowersDay : WeatherType("rain-snow-showers-day", R.drawable.rain_snow_showers_day)
    object RainSnowShowersNight : WeatherType("rain-snow-showers-night", R.drawable.rain_snow_showers_night)
    object ShowersDay : WeatherType("showers-day", R.drawable.showers_day)
    object ShowersNight : WeatherType("showers-night", R.drawable.showers_night)
    object Sleet : WeatherType("sleet", R.drawable.sleet)
    object Snow : WeatherType("snow", R.drawable.snow)
    object SnowShowersDay : WeatherType("snow-showers-day", R.drawable.snow_showers_day)
    object SnowShowersNight : WeatherType("snow-showers-night", R.drawable.snow_showers_night)

    object Thunder: WeatherType("thunder", R.drawable.thunder)
    object ThunderRain: WeatherType("thunder-rain", R.drawable.thunder_rain)
    object ThunderShowersDay: WeatherType("thunder-showers-day", R.drawable.thunder_showers_day)
    object ThunderShowersNight: WeatherType("thunder-showers-night", R.drawable.thunder_showers_night)
    object Wind: WeatherType("wind", R.drawable.wind)
}