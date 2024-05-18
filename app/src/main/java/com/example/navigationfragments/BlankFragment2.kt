package com.example.navigationfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationfragments.databinding.FragmentBlank2Binding

class BlankFragment2 : Fragment() {
    private lateinit var binding: FragmentBlank2Binding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlank2Binding.inflate(inflater, container, false)
        binding.button4.setOnClickListener {
            navController.navigate(R.id.action_blankFragment2_to_settingsFragment)
        }
        return binding.root
    }
}