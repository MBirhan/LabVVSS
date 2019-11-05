package com.example.shoppinglistapplication.repository

import com.example.shoppinglistapplication.model.ShoppingItem


class ItemsRepository {

    var shoppingItems: MutableList<ShoppingItem>? = null

    fun addItem(shoppingItem: ShoppingItem) {
        shoppingItems?.add(shoppingItem)
    }

    fun updateIttem(newItem: ShoppingItem) {
        shoppingItems?.map {
            if (it.id == newItem.id) {
                it.name = newItem.name
                it.price = newItem.price
                it.priority = newItem.priority
            }
        }
    }

    fun removeItem(id: Int) {
        shoppingItems?.removeAll {
            it.id == id
        }
    }

    fun getItem(id: Int): ShoppingItem?{
        return shoppingItems?.find {
            it.id == id
        }
    }
}