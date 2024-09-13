package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.widget.ImageView;
import android.widget.TextView;

class ForecastFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
            // Inflate the fragment's layout from XML
            val view = inflater.inflate(R.layout.fragment_forecast, container, false)

            // Get references to the TextView and ImageView in the layout
            val dayTextView: TextView = view.findViewById(R.id.day_text_view)
    val weatherImageView: ImageView = view.findViewById(R.id.weather_icon_image_view)

    // Set dynamic content if needed
    dayTextView.text = "Thursday" // You can dynamically change this text based on forecast data
    weatherImageView.setImageResource(R.drawable.sunny) // Dynamically set the weather icon

    return view
    }
}
