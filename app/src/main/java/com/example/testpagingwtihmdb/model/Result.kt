package com.example.testpagingwtihmdb.model


import com.google.gson.annotations.SerializedName

data class Result(
    @field:SerializedName("id") val id: Long,
    val adult: Boolean,
    @field:SerializedName("backdrop_path") val backdropPath: String,
    @field:SerializedName("genre_ids") val genreIds: List<Int>,
    @field:SerializedName("original_language") val originalLanguage: String,
    @field:SerializedName("original_title") val originalTitle: String,
    val overview: String,
    val popularity: Double,
    @field:SerializedName("poster_path") val posterPath: String,
    @field:SerializedName("release_date") val releaseDate: String,
    val title: String,
    val video: Boolean,
    @field:SerializedName("vote_average")
    val voteAverage: Double,
    @field:SerializedName("vote_count")
    val voteCount: Int
)