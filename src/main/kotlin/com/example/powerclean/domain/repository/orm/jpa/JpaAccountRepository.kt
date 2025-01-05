package com.example.powerclean.domain.repository.orm.jpa

import com.example.powerclean.domain.model.Account
import com.example.powerclean.domain.repository.AccountRepository
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

public interface JpaAccountRepository : JpaRepository<Account, UUID>, AccountRepository
