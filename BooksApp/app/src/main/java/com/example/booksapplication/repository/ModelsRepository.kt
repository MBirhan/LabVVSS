package com.example.booksapplication.repository

import com.example.booksapplication.model.Model
import com.example.booksapplication.networking.LibraryEndpoint
import com.example.booksapplication.networking.NetworkManager
import io.reactivex.Single


class BookRepository {

    var network: LibraryEndpoint = NetworkManager.bookNetwork


    fun getBooks(): Single<List<Model>> {
        return network.getModels()
    }

    fun addBooks(title: String): Single<String> {
        return network.addModel(title)
    }
}