package com.hitanshudhawan.popcorn2.network.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenresJson(
    val genres: List<GenreJson>
)

@JsonClass(generateAdapter = true)
data class GenreJson(
    val id: Int,
    val name: String
)