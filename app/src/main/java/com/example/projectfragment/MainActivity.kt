package com.example.projectfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonToggleBlueFragment = findViewById<Button>(R.id.button_toggle_blue_fragment)
        val buttonToggleRedFragment = findViewById<Button>(R.id.button_toggle_red_fragment)

        buttonToggleBlueFragment.setOnClickListener {
            toggleFragment(BlueFragment(), "BLUE_FRAGMENT", R.id.blue_fragment_container)
        }

        buttonToggleRedFragment.setOnClickListener {
            toggleFragment(RedFragment(), "RED_FRAGMENT", R.id.red_fragment_container)
        }
    }

    private fun toggleFragment(fragment: Fragment, tag: String, containerId: Int) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val existingFragment = fragmentManager.findFragmentByTag(tag)
        if (existingFragment == null) {
            fragmentTransaction.add(containerId, fragment, tag)
        } else {
            fragmentTransaction.remove(existingFragment)
        }

        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        fragmentTransaction.commit()
    }
}
