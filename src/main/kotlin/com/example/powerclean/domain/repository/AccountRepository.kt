package com.example.powerclean.domain.repository

import com.example.powerclean.domain.model.Account

public interface AccountRepository {
    fun save(account: Account): Account

    fun findByName(name: String): Account?
}
