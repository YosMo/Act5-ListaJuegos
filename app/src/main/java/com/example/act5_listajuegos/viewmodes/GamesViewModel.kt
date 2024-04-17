package com.example.act5_listajuegos.viewmodes

import androidx.lifecycle.ViewModel
import com.example.act5_listajuegos.R
import com.example.act5_listajuegos.models.Game


class GamesViewModel: ViewModel() {
    init {}

    fun getGameList(): ArrayList<Game> {
        var gameList: ArrayList<Game> = ArrayList<Game>()

        gameList.add(Game("Dead by Daylight", 500, "PC","AO", R.drawable.dbd))
        gameList.add(Game("Resident Evil 2", 1200, "PS4","M", R.drawable.re2))
        gameList.add(Game("Resident Evil 3", 1600, "PS4","M", R.drawable.re3))
        gameList.add(Game("Resident Evil 4", 1800, "PS4","M", R.drawable.re4))
        gameList.add(Game("Detroid Become Human", 700, "PS4","E", R.drawable.dbh))
        gameList.add(Game("Beyond Two Souls", 1200, "PS4","E10", R.drawable.b2s))
        gameList.add(Game("Resident Evil: Village", 1000, "PS5","M", R.drawable.rev))
        gameList.add(Game("The Last Of Us", 1200, "PS4","AO", R.drawable.tlou))
        gameList.add(Game("The Quarry", 3000, "XBOX ONE","E", R.drawable.tq))
        gameList.add(Game("Until Dawn", 1800, "PS4","E", R.drawable.ud))

        return gameList
    }
}