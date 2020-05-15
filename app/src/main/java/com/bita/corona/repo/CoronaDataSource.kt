@file:Suppress("FunctionName", "unused", "NonAsciiCharacters")

package com.bita.corona.repo

import retrofit2.http.GET
import retrofit2.http.Query

interface CoronaDataSource {

    @GET("Covid19InfStateJson")
    fun 감염현황조회(@Query("startCreateDt") startCreateDt: String, @Query("endCreateDt") endCreateDt: String)
}