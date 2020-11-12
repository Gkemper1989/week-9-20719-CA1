package com.example.ca1_20719


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.ca1_20719.databinding.ActivityMainBinding
import timber.log.Timber


class MainActivity : AppCompatActivity() {

    private var revenue = 0

    private lateinit var binding: ActivityMainBinding

    data class Teas(val name: String, val prices: Float, val amount: Float)

    private val allTeas = listOf(
        Teas("Darjelling", 8.5f, 100f),
        Teas("Assam", 7.5f, 100f),
        Teas("Lapsang Sous", 9.5f, 100f),
        Teas("Earl Grey", 3.5f, 100f),
        Teas("Irish Breakfast", 2.5f, 100f)
    )
    private var currentTea = allTeas[0]

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("onCreate Called")

        // Use Data Binding to get reference to the views
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.revenue = revenue
        binding.amount = totalSold
    }

    private fun onTeaNameClicked() {
        revenue += currentTea.prices

        binding.revenue = revenue
        binding.amountSold =
    }
}