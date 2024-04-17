package com.example.act5_listajuegos.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun GameData(console: String, price: Int, classification: String) {
    Column () {
        Text(
            text = console,
            fontSize = 15.sp,
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = classification,
            fontSize = 15.sp,
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "$$price",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF009688),
        )
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewData() {
    GameData("Nintendo DS", 1600, "E")
}