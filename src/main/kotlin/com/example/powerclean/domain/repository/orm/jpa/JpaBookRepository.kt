package com.example.powerclean.domain.repository.orm.jpa

import com.example.powerclean.domain.model.Book
import com.example.powerclean.domain.repository.BookRepository
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

public interface JpaBookRepository : JpaRepository<Book, UUID>, BookRepository
