package com.example.powerclean.domain.repository

import com.example.powerclean.domain.model.Book

public interface BookRepository {
    fun save(book: Book): Book
}
