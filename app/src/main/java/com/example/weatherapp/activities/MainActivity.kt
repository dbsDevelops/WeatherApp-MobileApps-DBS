package com.example.weatherapp.activities

import android.Manifest
import android.animation.ObjectAnimator
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import android.view.animation.OvershootInterpolator
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.core.animation.doOnEnd
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.checkSelfPermission
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.weatherapp.R
import com.example.weatherapp.databinding.ActivityMainBinding
import com.example.weatherapp.weather.MainViewModel
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

class MainActivity : ComponentActivity() {
    // Initialise view model
    //TODO: Implement the DataModel instead of the ViewModel
    private val viewModel by viewModels<MainViewModel>()

    // Bind view to current activity
    private val view: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    companion object {
        private const val LOCATION_PERMISSION_REQUEST_CODE = 101
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Set up splash screen
        installSplashScreen().apply {
            setKeepOnScreenCondition {
                !viewModel.isReady.value
            }
            setOnExitAnimationListener { screen ->
                val zoomX = ObjectAnimator.ofFloat(
                    screen.iconView,
                    View.SCALE_X,
                    0.4f,
                    0.0f
                )
                zoomX.interpolator = OvershootInterpolator()
                zoomX.duration = 500L
                zoomX.doOnEnd { screen.remove() }

                val zoomY = ObjectAnimator.ofFloat(
                    screen.iconView,
                    View.SCALE_Y,
                    0.4f,
                    0.0f
                )
                zoomY.interpolator = OvershootInterpolator()
                zoomY.duration = 500L
                zoomY.doOnEnd { screen.remove() }

                zoomX.start()
                zoomY.start()
            }
        }
        setContentView(view.root)

        // Set up logic for fetching current location
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)
        findViewById<Button>(R.id.btnGetLocation).setOnClickListener {
            fetchLocation()
        }

        // Set up logic for going to favourite cities activity
        val btnFavouriteCities = view.btnFavouriteCities
        btnFavouriteCities.setOnClickListener {
            val intent = android.content.Intent(this,
                FavouriteCitiesActivity::class.java)
            startActivity(intent)
        }

        // Set up logic for going to available cities activity
        val btnAvailableCities = view.btnAvailableCities
        btnAvailableCities.setOnClickListener {
            val intent = android.content.Intent(this,
                AvailableCitiesActivity::class.java)
            startActivity(intent)
        }

    }

    private fun fetchLocation() {
        val task = fusedLocationProviderClient.lastLocation
        if (checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED
            && checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION)
            != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                                                    LOCATION_PERMISSION_REQUEST_CODE
            )
            return
        }

        task.addOnSuccessListener {
            if (it != null) {
                // Toast.makeText(applicationContext, "Latitude: ${it.latitude}, Longitude: ${it.longitude}", Toast.LENGTH_SHORT).show()
                val textView = findViewById<android.widget.TextView>(R.id.tvGpsCoordinates)
                textView.text = "Latitude: ${it.latitude}, Longitude: ${it.longitude}"
            }
        }
    }
}