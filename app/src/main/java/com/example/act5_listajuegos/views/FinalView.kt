package com.example.act5_listajuegos.views


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun FinalView(navController: NavHostController, total: Int) {
    Box(modifier = Modifier.fillMaxSize()
        .padding(10.dp),
        contentAlignment = Alignment.TopStart){
        Button(
            onClick = {navController.popBackStack()},
            colors = ButtonDefaults.buttonColors(Color(0xFF816686)),
            modifier = Modifier
                .width(150.dp)

        ) {
            Text(text = "← Regresar", fontWeight = FontWeight.Bold, fontSize = 18.sp)
        }
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Total: $ $total",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            color = Color(0xFF000000)
        )

        Text(
            text = "¡Gracias por tu compra!",
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp,
            color = Color(0xFF000000)
        )

        Spacer(modifier = Modifier.height(15.dp))


    }
}

@Preview(showBackground = true)
@Composable
fun Preview_Final() {
    FinalView(navController = rememberNavController(), 2000)
}