package com.example.testpagingwtihmdb.testmodel


import com.google.gson.annotations.SerializedName

data class GitRepotest(
    @field:SerializedName("incomplete_results") val incompleteResults: Boolean,
    val items: List<Item>,
    @field:SerializedName("total_count") val totalCount: Int
)