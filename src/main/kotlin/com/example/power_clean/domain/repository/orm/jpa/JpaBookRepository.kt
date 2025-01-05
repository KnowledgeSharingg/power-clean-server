package com.example.power_clean.domain.repository.orm.jpa

import org.springframework.data.jpa.repository.JpaRepository
import com.example.power_clean.domain.model.Book
import com.example.power_clean.domain.repository.BookRepository
import java.util.UUID

public interface JpaBookRepository : JpaRepository<Book, UUID>, BookRepository {
}