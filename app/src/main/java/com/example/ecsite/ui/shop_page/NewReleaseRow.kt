package com.example.ecsite.ui.shop_page

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecsite.R

@Composable
fun NewReleaseElement(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.kiwi),
            contentDescription = "Tops1",
            modifier = Modifier
                .size(180.dp)
                .fillMaxWidth()
        )
        Text(
            text = "Aichi Konan",
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .paddingFromBaseline(
                    top = 24.dp, bottom = 8.dp
                ),
            fontSize = 20.sp
        )
        Text(
            text = "¥1,000",
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .paddingFromBaseline(
                    top = 24.dp, bottom = 8.dp
                ),
            fontSize = 20.sp
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun PreviewNewReleaseElement() {
    NewReleaseElement()
}