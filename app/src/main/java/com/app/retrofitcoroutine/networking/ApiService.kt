package com.app.retrofitcoroutine.networking

import com.app.retrofitcoroutine.model.SearchResultModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {
    companion object {
        val BASE_URL: String = "https://demo.dataverse.org/api/"
    }

    @GET("search")
    suspend fun getResult(
            @Query("q") query: String?): Response<SearchResultModel?>
}