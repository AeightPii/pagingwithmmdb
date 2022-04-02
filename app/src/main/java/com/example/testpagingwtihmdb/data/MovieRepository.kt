package com.example.testpagingwtihmdb.data

import android.util.Log
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.testpagingwtihmdb.api.MovieServices
import com.example.testpagingwtihmdb.model.Result
import kotlinx.coroutines.flow.Flow

class MovieRepository (private val service: MovieServices){
    fun getSearchResultStream(query: String): Flow<PagingData<Result>> {
        Log.d("MovieRepository", "New query: $query")
        return Pager(
            config = PagingConfig(pageSize = NETWORK_PAGE_SIZE, enablePlaceholders = false),
            pagingSourceFactory = { MoviePagingSource(service, query) }
        ).flow
    }

    companion object {
        const val NETWORK_PAGE_SIZE = 1
    }
}