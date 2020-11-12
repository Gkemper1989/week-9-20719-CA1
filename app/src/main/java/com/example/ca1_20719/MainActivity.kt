package com.example.ca1_20719

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private var teaSold = 0
    private var revenue = 0

    private lateinit var binding: ActivityMainBinding


    data class Teas (val name: String, val prices: Float, val amount: Float)

    private val allTeas = ListOf(
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

        binding.

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}