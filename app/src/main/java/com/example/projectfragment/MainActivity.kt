package com.example.projectfragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val menuFragment = MenuFragment()
            val contentFragment = ContentFragment()

            supportFragmentManager.beginTransaction()
                .add(R.id.menu_fragment_container, menuFragment)
                .add(R.id.content_fragment_container, contentFragment)
                .commit()
        }
    }
}
