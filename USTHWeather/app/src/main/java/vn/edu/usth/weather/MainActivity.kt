package vn.edu.usth.weather

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import vn.edu.usth.weather.ui.theme.UsthWeatherTheme

class WeatherActivity : AppCompatActivity() {
    @Override
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)
        Log.i(TAG, "onCreate() called")
    }

    @Override
    protected fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart() called")
    }

    @Override
    protected fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume() called")
    }

    @Override
    protected fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause() called")
    }

    @Override
    protected fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop() called")
    }

    @Override
    protected fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy() called")
    }

    companion object {
        private const val TAG = "WeatherActivity"
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier, onWeatherButtonClick: () -> Unit) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Greeting("Android")

        Spacer(modifier = Modifier.height(16.dp))

        // Add a button to launch WeatherActivity
        Button(onClick = { onWeatherButtonClick() }) {
            Text(text = "Open Weather Activity")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    UsthWeatherTheme {
        MainScreen(onWeatherButtonClick = {})
    }
}
