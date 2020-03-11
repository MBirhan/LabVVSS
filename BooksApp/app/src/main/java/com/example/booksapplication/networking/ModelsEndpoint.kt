package com.example.booksapplication.networking

import com.example.booksapplication.model.Model
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface LibraryEndpoint {

    @GET("models")
    fun getModels(): Single<List<Model>>

    @POST("model")
    fun addModel(@Body model: String, status: String, client: Int, time: Int, cost: Int): Single<String>
}