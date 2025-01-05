package com.example.power_clean.domain.repository

import com.example.power_clean.domain.model.Account

public interface AccountRepository {
    fun save(account: Account): Account
    fun findByName(name: String): Account?
}