package com.hitanshudhawan.popcorn2.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TVShowGenreEntity(
    @PrimaryKey
    val id: Int,
    val name: String
)