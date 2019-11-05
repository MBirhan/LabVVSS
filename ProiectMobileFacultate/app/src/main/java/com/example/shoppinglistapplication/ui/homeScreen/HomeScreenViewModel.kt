package com.example.shoppinglistapplication.ui.homeScreen

import com.example.shoppinglistapplication.model.ShoppingItem
import com.example.shoppinglistapplication.repository.ItemsRepository
import kotlin.random.Random


class HomeScreenViewModel {

    private val repository: ItemsRepository = ItemsRepository()

    fun addItem(name: String, price: Int, priority: String) {
        repository.addItem(
            ShoppingItem(
                id = Random.nextInt(1, 999999),
                name = name,
                price = price,
                priority = priority
            )
        )
    }

    fun removeItem(id: Int) {
        repository.removeItem(id)
    }

    fun updateItem(id: Int, name: String, price: Int, priority: String) {
        repository.updateIttem(
            ShoppingItem(
                id = id,
                name = name,
                price = price,
                priority = priority
            )
        )
    }

    fun getItem(id: Int): ShoppingItem? {
        return repository.getItem(id)
    }
}