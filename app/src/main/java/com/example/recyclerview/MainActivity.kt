package com.example.recyclerview


import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    lateinit var adapter: RecyclerView.Adapter<*>
    lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var animeList = mutableListOf<Animedate>()

        animeList.add(Animedate("One Punch Man", 1.0f, 1, R.drawable.anime_saitama))
        animeList.add(Animedate("Angel Beats", 1.1f, 2, R.drawable.anime_angel))
        animeList.add(Animedate("Sword art Online", 1.5f, 3, R.drawable.anime_sword))
        animeList.add(Animedate("Dark Than Black", 1.6f, 4, R.drawable.anime_dark))
        animeList.add(Animedate("Kaguya-sama", 2.1f, 7, R.drawable.anime_kaguya))
        animeList.add(Animedate("Monogatari", 2.2f, 8, R.drawable.anime_monogatari))
        animeList.add(Animedate("Maou Retry!", 2.3f, 9, R.drawable.anime_maou))
        animeList.add(Animedate("Naruto", 3.2f, 13, R.drawable.anime_naruto))
        animeList.add(Animedate("Mekakucity Actors", 1.03f, 2016, R.drawable.anime_shintaro))
        animeList.add(Animedate("Sakura Pet", 4.1f, 16, R.drawable.anime_sakurapet))
        animeList.add(Animedate("Stans gate", 4.4f, 19, R.drawable.anime_stans))
        animeList.add(Animedate("Dr Stone", 5f, 19, R.drawable.anime_stone))
        animeList.add(Animedate("Arifureta", 6f, 23, R.drawable.anime_arifureta))
        animeList.add(Animedate("Chobits", 7f, 25, R.drawable.anime_chii))
        animeList.add(Animedate("Index", 8f, 26, R.drawable.anime_index))
        animeList.add(Animedate("Nanatsu No Taizai", 9f, 28, R.drawable.anime_meliodas))

        viewManager = LinearLayoutManager(this)
        adapter = AndroidVersionAdapter(animeList)

        rv.adapter = adapter
        rv.layoutManager = viewManager
    }
}
