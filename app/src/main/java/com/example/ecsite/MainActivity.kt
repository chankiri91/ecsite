package com.example.ecsite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ecsite.ui.theme.EcSiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcSiteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    EcSite()
                }
            }
        }
    }
}

@Composable
fun EcSite() {
//    var currentScreen: EcDestination by remember { mutableStateOf(Shop) }
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            EcBottomNavigation(
                items = destinationList,
                navController = navController,
                onItemClick = {
                    navController.navigate(it.route)
                }
            )
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = Shop.route,
        ) {
            composable(route = Shop.route) {
                Shop.screen()
            }
            composable(route = Favorite.route) {
                Favorite.screen()
            }
            composable(route = MyPage.route) {
                MyPage.screen()
            }
        }
    }
}