package com.example.myapplication.datasouce

import com.example.myapplication.R
import com.example.myapplication.datamodel.restaurant



class DataSourceTaxi {
    val listetaxi = listOf<restaurant>(
        restaurant(R.string.restaurant1),
        restaurant(R.string.restaurant2),
        restaurant(R.string.restaurant3),
        restaurant(R.string.restaurant4),
        restaurant(R.string.restaurant5),
        restaurant(R.string.restaurant6),
        restaurant(R.string.restaurant7),
        restaurant(R.string.restaurant8)
    )
    fun loadAffirmations(): List<restaurant> {
        return listetaxi
    }

}