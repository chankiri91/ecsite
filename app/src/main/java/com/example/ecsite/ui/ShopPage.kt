package com.example.ecsite.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController

@Composable
fun ShopPage(modifier: Modifier = Modifier) {
    val navController = rememberNavController()


}

@Preview
@Composable
fun PreviewShopPage(modifier: Modifier = Modifier) {
    ShopPage()
}