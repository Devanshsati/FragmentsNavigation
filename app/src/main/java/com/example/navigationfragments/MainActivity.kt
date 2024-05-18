package com.example.navigationfragments

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        findViewById<Button>(R.id.button1).setOnClickListener {
            if(navController.currentDestination?.id == R.id.blankFragment2){
                navController.navigate(R.id.action_blankFragment2_to_blankFragment1)
            }
            if(navController.currentDestination?.id == R.id.settingsFragment){
                navController.navigate(R.id.action_settingsFragment_to_blankFragment1)
            }
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            if(navController.currentDestination?.id == R.id.blankFragment1){
                navController.navigate(R.id.action_blankFragment1_to_blankFragment2)
            }
            if(navController.currentDestination?.id == R.id.settingsFragment){
                navController.navigate(R.id.action_settingsFragment_to_blankFragment2)
            }
        }
    }
}
