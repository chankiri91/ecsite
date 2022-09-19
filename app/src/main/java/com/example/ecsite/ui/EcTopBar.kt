package com.example.ecsite.ui

import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun EcTopBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = { Text(text = "Kazuma Kiriyama") },
        navigationIcon = {
            Icon(
                imageVector = Icons.Filled.Notifications,
                contentDescription = null
            )
        }
    )
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun PreviewEcTopBar() {
    EcTopBar()
}