package com.example.ecsite

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.ecsite.ui.FavoritePage
import com.example.ecsite.ui.MyPage
import com.example.ecsite.ui.ShopPage

interface Destination {
    val icon: ImageVector
    val route: String
    val screen: @Composable () -> Unit
}

object Shop: Destination {
    override val icon = Icons.Filled.ShoppingCart
    override val route = "shop"
    override val screen: @Composable () -> Unit = { ShopPage()}
}

object Favorite: Destination {
    override val icon = Icons.Filled.Favorite
    override val route = "favorite"
    override val screen: @Composable () -> Unit = { FavoritePage() }
}

object MyPage: Destination {
    override val icon = Icons.Filled.AccountCircle
    override val route = "mypage"
    override val screen: @Composable () -> Unit = { MyPage() }
}