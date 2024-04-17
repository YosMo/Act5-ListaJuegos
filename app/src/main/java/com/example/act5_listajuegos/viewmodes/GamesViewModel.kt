package com.example.act5_listajuegos.viewmodes

import androidx.lifecycle.ViewModel
import com.example.act5_listajuegos.models.Game


class GamesViewModel: ViewModel() {
    init {}

    fun getGameList(): ArrayList<Game> {

        var gameList: ArrayList<Game> = ArrayList<Game>()

        gameList.add(Game("Pokemon SoulSilver", 1000, "Nintendo DS", "E", R.drawable.pk_ss))
        gameList.add(Game("Pokemon HeartGold", 1000, "Nintendo DS", "E", R.drawable.pk_hg))
        gameList.add(Game("Pokemon White", 1100, "Nintendo DS", "E10", R.drawable.pk_b))
        gameList.add(Game("Pokemon Black", 1100, "Nintendo DS", "E10", R.drawable.pk_n))
        gameList.add(Game("Pokemon White 2", 1100, "Nintendo DS", "M", R.drawable.pk_b2))
        gameList.add(Game("Pokemon Black 2", 1100, "Nintendo DS", "M", R.drawable.pk_n2))
        gameList.add(Game("Pokemon X", 1200, "Nintendo 3DS", "T", R.drawable.pk_x))
        gameList.add(Game("Pokemon Y", 1200, "Nintendo 3DS", "T", R.drawable.pk_y))
        gameList.add(Game("Pokemon Black Zafiro Alpha", 1200, "Nintendo 3DS", "AO", R.drawable.pk_za))
        gameList.add(Game("Pokemon Black Ruby Omega", 1200, "Nintendo 3DS", "AO", R.drawable.pk_or))
        gameList.add(Game("Pokemon Black Ultra Moon", 1200, "Nintendo 3DS", "M", R.drawable.pk_um))
        gameList.add(Game("Pokemon Black Ultra Sun", 1200, "Nintendo 3DS", "M", R.drawable.pk_us))

        return gameList
    }
}