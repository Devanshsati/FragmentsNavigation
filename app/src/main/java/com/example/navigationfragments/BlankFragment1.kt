package com.example.navigationfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationfragments.databinding.FragmentBlank1Binding

class BlankFragment1 : Fragment() {
    private lateinit var binding: FragmentBlank1Binding
    private lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBlank1Binding.inflate(inflater, container, false)
        binding.button3.setOnClickListener {
                navController.navigate(R.id.action_blankFragment1_to_settingsFragment)
        }

        return binding.root
    }
}