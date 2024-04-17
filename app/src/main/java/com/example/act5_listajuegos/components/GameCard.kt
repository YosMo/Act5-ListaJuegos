package com.example.act5_listajuegos.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gamesact5.R
import com.example.gamesact5.models.Game

@Composable
fun GameCard(game: Game) {
    Card () {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = game.image),
                contentDescription = "Game",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(120.dp)
                    .clip(shape = RoundedCornerShape(10.dp))
            )

            Spacer(modifier = Modifier.width(15.dp))

            Column () {
                Text(
                    text = game.name,
                    color = Color(0xFF000000),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 5.dp)
                )

                Spacer(modifier = Modifier.height(5.dp))

                GameData(game.console, game.price, game.classification)

                Spacer(modifier = Modifier.height(5.dp))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCard() {
    GameCard(game = Game("Pokemon SoulSilver", 1000, "Nintendo DS", "E", R.drawable.pk_ss))
}