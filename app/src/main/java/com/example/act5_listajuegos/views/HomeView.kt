package com.example.act5_listajuegos.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.act5_listajuegos.R

@Composable
fun HomeView(navController: NavHostController) {

    //Variables
    var age: Int by remember {mutableStateOf(0)}
    var budget: Int by remember {mutableStateOf(0)}

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Presupuesto Inicial",
            fontSize = 27.sp,
        )

        Spacer(modifier = Modifier.height(18.dp))

        TextField(
            value = age.toString(),
            onValueChange = {age = it.toInt()},
            label = { Text("Edad") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),

        )

        Spacer(modifier = Modifier.height(5.dp))

        TextField(
            value = budget.toString(),
            onValueChange = {budget = it.toInt()},
            label = { Text("Presupuesto") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 30.dp),


        )

        Spacer(modifier = Modifier.height(18.dp))

        Button(
            onClick = {
                navController.navigate("GameView/$age/$budget")
            },
            colors = ButtonDefaults.buttonColors(Color(0xFF725C9B)),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(horizontal = 30.dp)
        ) {
            Text(
                text = "Ver productos",
                color = Color(0xFFFFFFFF),
                fontSize = 16.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_Home() {
    HomeView(navController = rememberNavController())
}