package com.example.movierowtask

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.movierowtask.screens.DetailScreen
import com.example.movierowtask.screens.HomeScreen

@Composable
fun MyNav(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "homescreen"){
        composable("homescreen") { HomeScreen(navController = navController)}
        composable("detailscreen") { DetailScreen(navController = navController)}
    }
}