package org.triplepy.repository

import org.springframework.data.repository.CrudRepository
import org.triplepy.entity.User

/**
 * Created by jelly on 11/01/2017.
 */
interface UserRepository : CrudRepository<User, Long> {
    fun findByUserId(userId: Long): User
}