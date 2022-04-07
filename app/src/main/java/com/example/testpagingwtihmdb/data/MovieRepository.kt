package com.example.testpagingwtihmdb.data

import android.util.Log
import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.testpagingwtihmdb.api.MovieServices
import com.example.testpagingwtihmdb.db.MovieDatabase
import com.example.testpagingwtihmdb.model.Result
import kotlinx.coroutines.flow.Flow

class MovieRepository(
    private val service: MovieServices,
    private val database: MovieDatabase
) {
    fun getSearchResultStream(query: String): Flow<PagingData<Result>> {
        Log.d("GithubRepository", "New query: $query")

        // appending '%' so we can allow other characters to be before and after the query string
        val dbQuery = "%${query.replace(' ', '%')}%"
        val pagingSourceFactory = { database.movieDao().moviesByName(dbQuery) }


        @OptIn(ExperimentalPagingApi::class)
        return Pager(
            config = PagingConfig(pageSize = NETWORK_PAGE_SIZE, enablePlaceholders = false),
            remoteMediator = MovieRemoteMediator(
                query,
                service,
                database
            ),
            pagingSourceFactory = pagingSourceFactory
        ).flow
    }

    companion object {
        const val NETWORK_PAGE_SIZE = 30
    }
}