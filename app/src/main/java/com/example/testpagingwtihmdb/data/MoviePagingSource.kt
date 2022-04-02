package com.example.testpagingwtihmdb.data

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.testpagingwtihmdb.api.IN_QUALIFIER
import com.example.testpagingwtihmdb.api.MovieServices
import com.example.testpagingwtihmdb.data.MovieRepository.Companion.NETWORK_PAGE_SIZE
import com.example.testpagingwtihmdb.model.Result
import retrofit2.HttpException
import java.io.IOException

private const val MOVIE_STARTING_PAGE_INDEX = 1

class MoviePagingSource(
    private val service: MovieServices,
    private val query: String
) : PagingSource<Int, Result>() {
    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        // We need to get the previous key (or next key if previous is null) of the page
        // that was closest to the most recently accessed index.
        // Anchor position is the most recently accessed index
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }

    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        val position = params.key ?: MOVIE_STARTING_PAGE_INDEX
        val apiQuery = query
        val apiKey = "59e90160f05dc382b043b086e34c75c5"
        return try {
            val response = service.searchMovies(apiQuery, position, apiKey, params.loadSize)
            val repos = response.results
            val nextKey = if (repos.isEmpty()) {
                null
            } else {
                // initial load size = 3 * NETWORK_PAGE_SIZE
                // ensure we're not requesting duplicating items, at the 2nd request
                position + (params.loadSize / NETWORK_PAGE_SIZE)
            }
            LoadResult.Page(
                data = repos,
                prevKey = if (position == MOVIE_STARTING_PAGE_INDEX) null else position - 1,
                nextKey = nextKey
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }

}