package com.example.power_clean.domain.repository.orm.jpa


import org.springframework.data.jpa.repository.JpaRepository
import AccountRepository
import com.example.power_clean.domain.model.Account

public interface JpaAccountRepository : JpaRepository<Account, Long>, AccountRepository {
}