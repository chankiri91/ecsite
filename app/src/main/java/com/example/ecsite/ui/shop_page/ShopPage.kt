package com.example.ecsite.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.ecsite.R
import com.example.ecsite.ui.shop_page.NewReleaseElement
import com.example.ecsite.ui.shop_page.NewReleaseRow

@Composable
fun ShopPage(modifier: Modifier = Modifier) {
    NewReleaseRow()
}

@Preview
@Composable
fun PreviewShopPage(modifier: Modifier = Modifier) {
    ShopPage()
}