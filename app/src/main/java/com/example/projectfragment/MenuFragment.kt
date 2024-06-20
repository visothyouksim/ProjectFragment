package com.example.projectfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        val buttonMenu = view.findViewById<Button>(R.id.button_menu)
        buttonMenu.setOnClickListener {
            Toast.makeText(activity, "Bouton de 10%", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
