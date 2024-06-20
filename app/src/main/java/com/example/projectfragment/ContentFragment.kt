package com.example.projectfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment

class ContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_content, container, false)

        val buttonContent = view.findViewById<Button>(R.id.button_content)
        buttonContent.setOnClickListener {
            Toast.makeText(activity, "Bouton de 90%", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
