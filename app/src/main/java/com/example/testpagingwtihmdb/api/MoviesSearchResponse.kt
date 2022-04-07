package com.example.testpagingwtihmdb.api


import com.example.testpagingwtihmdb.model.Result
import com.google.gson.annotations.SerializedName

data class MoviesSearchResponse(
    val page: Int,
    @SerializedName("results") val results: List<Result> = emptyList(),
    @SerializedName("total_results") val totalResults: Int = 0,
    @SerializedName("total_pages") val totalPages: Int,//ignore this
    val nextPage: Int? = null
)