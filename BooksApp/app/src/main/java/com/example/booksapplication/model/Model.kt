package com.example.booksapplication.model

import com.squareup.moshi.Json

class Book (
    @field:Json(name = "id")
    var id: String?,
    @field:Json(name = "model")
    var model: String,
    @field:Json(name = "status")
    var status: String?,
    @field:Json(name = "client")
    var client: Int?,
    @field:Json(name = "time")
    var time: Int?,
    @field:Json(name = "cost")
    var cost: Int?
)