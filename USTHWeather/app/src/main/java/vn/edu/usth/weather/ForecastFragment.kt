package vn.edu.usth.weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment

class ForecastFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Create the parent LinearLayout
        val linearLayout = LinearLayout(requireContext()).apply {
            orientation = LinearLayout.VERTICAL // Set vertical orientation
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            setPadding(16, 16, 16, 16) // Optional padding
        }

        // Create a TextView for the day
        val dayTextView = TextView(requireContext()).apply {
            text = "Thursday"
            textSize = 18f // Set the text size
            setPadding(0, 0, 0, 16) // Optional padding below the text
        }

        // Create an ImageView for the weather icon
        val weatherImageView = ImageView(requireContext()).apply {
            // Set a weather icon (ensure the icon is placed in res/drawable-hdpi)
            setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.sunny))

            // Set layout parameters for the ImageView
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
            // Optionally, scale the image if needed
            scaleType = ImageView.ScaleType.CENTER_INSIDE
        }

        // Add the TextView and ImageView to the LinearLayout
        linearLayout.addView(dayTextView)
        linearLayout.addView(weatherImageView)

        // Return the LinearLayout as the fragment view
        return linearLayout
    }
}
