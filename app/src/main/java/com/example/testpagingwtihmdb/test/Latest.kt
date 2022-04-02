package com.example.testpagingwtihmdb.test

import com.google.gson.annotations.SerializedName

data class Latest(

	@field:SerializedName("original_language")
	val originalLanguage: String,

	@field:SerializedName("imdb_id")
	val imdbId: Any,

	@field:SerializedName("video")
	val video: Boolean,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("backdrop_path")
	val backdropPath: Any,

	@field:SerializedName("revenue")
	val revenue: Int,

	@field:SerializedName("genres")
	val genres: List<Any>,

	@field:SerializedName("popularity")
	val popularity: Double,

	@field:SerializedName("production_countries")
	val productionCountries: List<Any>,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("vote_count")
	val voteCount: Int,

	@field:SerializedName("budget")
	val budget: Int,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("original_title")
	val originalTitle: String,

	@field:SerializedName("runtime")
	val runtime: Int,

	@field:SerializedName("poster_path")
	val posterPath: Any,

	@field:SerializedName("spoken_languages")
	val spokenLanguages: List<SpokenLanguagesItem>,

	@field:SerializedName("production_companies")
	val productionCompanies: List<Any>,

	@field:SerializedName("release_date")
	val releaseDate: String,

	@field:SerializedName("vote_average")
	val voteAverage: Double,

	@field:SerializedName("belongs_to_collection")
	val belongsToCollection: Any,

	@field:SerializedName("tagline")
	val tagline: String,

	@field:SerializedName("adult")
	val adult: Boolean,

	@field:SerializedName("homepage")
	val homepage: String,

	@field:SerializedName("status")
	val status: String
)