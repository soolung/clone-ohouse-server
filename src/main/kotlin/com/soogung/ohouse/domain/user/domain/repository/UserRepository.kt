package com.soogung.ohouse.domain.user.domain.repository

import com.soogung.ohouse.domain.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface UserRepository: JpaRepository<User, Long> {

    @Query("SELECT u FROM User u WHERE u.id = :id")
    fun findUserById(id: Long): User?
}