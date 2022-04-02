package com.example.testpagingwtihmdb.api


import com.example.testpagingwtihmdb.model.Result
import com.google.gson.annotations.SerializedName

data class MoviesSearchResponse(
    val page: Int,
   val results: List<Result>,
    @SerializedName("total_results") val totalResults: Int = 0,
    @SerializedName("total_pages") val totalPages: Int,//ignore this
    val nextPage: Int? = null
)