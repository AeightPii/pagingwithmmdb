package com.example.testpagingwtihmdb.db

import androidx.paging.PagingSource
import androidx.room.*
import com.example.testpagingwtihmdb.model.Result
import retrofit2.http.DELETE

@Dao
interface MoviesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(mResults: List<Result>)

    @Query(
        "SELECT * FROM mResults WHERE " +
                "name LIKE :queryString"
    )
    fun moviesByName(queryString: String): PagingSource<Int, Result>

    @Query("DELETE FROM mResults")
    fun clearRepos()
}