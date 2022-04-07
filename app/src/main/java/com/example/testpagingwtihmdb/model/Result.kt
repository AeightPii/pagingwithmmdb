package com.example.testpagingwtihmdb.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "mResults")

data class Result(
    @PrimaryKey @field:SerializedName("id") val id: Long,

    @field:SerializedName("first_air_date")
    val firstAirDate: String?,

    @field:SerializedName("overview")
    val overview: String?,

    @field:SerializedName("original_language")
    val originalLanguage: String?,

//    @field:SerializedName("genre_ids")
//    val genreIds: List<Int>?,

    @field:SerializedName("poster_path")
    val posterPath: String?,

//    @field:SerializedName("origin_country")
//    val originCountry: List<String>?,

    @field:SerializedName("backdrop_path")
    val backdropPath: String?,

    @field:SerializedName("original_name")
    val originalName: String?,

    @field:SerializedName("popularity")
    val popularity: Double?,

    @field:SerializedName("vote_average")
    val voteAverage: Int?,

    @field:SerializedName("name")
    val name: String?,



    @field:SerializedName("vote_count")
    val voteCount: Int?
//    @field:SerializedName("name") val name: String,
//    @field:SerializedName("backdrop_path") val backdropPath: String,
////    @field:SerializedName("genre_ids") val genreIds: List<Int>,
//    @field:SerializedName("original_language") val originalLanguage: String,
//    @field:SerializedName("original_title") val originalTitle: String,
//    @field:SerializedName("poster_path") val posterPath: String,
////    @field:SerializedName("release_date") val releaseDate: String,
////    @field:SerializedName("vote_average") val voteAverage: Double,
//    @field:SerializedName("vote_count") val voteCount: Int
//

)