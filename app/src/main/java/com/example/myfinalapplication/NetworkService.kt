package com.example.myfinalapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NetworkService {
    @GET("apnmOrg/v1/list")
    fun getList(
        @Query("page") page:Long,
        @Query("perPage") perPage:Int,
        @Query("returnType") returnType: String,
        @Query("serviceKey") apiKey:String
    ) : Call<PageListModel>

    @GET("6260000/BusanPetAnimalInfoService/getPetAnimalInfo")
    fun getXmlList(
        @Query("ServiceKey") apiKey: String,
        @Query("pageNo") page: Int,
        @Query("numOfRows") pageSize:Int
    ): Call<responseInfo>
}