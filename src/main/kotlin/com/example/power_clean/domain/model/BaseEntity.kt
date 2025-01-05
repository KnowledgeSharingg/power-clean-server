package com.example.power_clean.domain.model

import java.time.LocalDateTime
import java.util.UUID
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.Id
import com.fasterxml.uuid.Generators 

@MappedSuperclass 
open class BaseEntity {
    // TODO: UUID v7 적용 , https://0soo.tistory.com/177
    @Id
    var id: UUID = Generators.timeBasedEpochGenerator().generate()
    var createdAt: LocalDateTime = LocalDateTime.now()
    var updatedAt: LocalDateTime = LocalDateTime.now()
    var deletedAt: LocalDateTime? = null
}