package com.example.shoppinglistapplication.model


data class ShoppingItem(
    var id: Int,
    var name: String,
    var price: Int,
    var priority: String
)

enum class Priority{
    CRITICAL,
    NORMAL,
    MINOR
}