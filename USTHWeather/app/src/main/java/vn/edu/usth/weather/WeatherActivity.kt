package vn.edu.usth.weather

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import vn.edu.usth.weather.ui.theme.UsthWeatherTheme


class WeatherActivity : ComponentActivity() {
    val test: String = "WeatherActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(test, "Create a new application")
        enableEdgeToEdge()
        setContent {
            UsthWeatherTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting2(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(test, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.i(test, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.i(test, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.i(test, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(test, "onDestroy() called")
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    UsthWeatherTheme {
        Greeting2("Android")
    }
}

class WeatherFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather, container, false)
    }
}