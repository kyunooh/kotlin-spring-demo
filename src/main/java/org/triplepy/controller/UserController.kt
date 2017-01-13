package org.triplepy.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.triplepy.entity.User
import org.triplepy.repository.UserRepository

/**
 * Created by jelly on 11/01/2017.
 */
@RestController()
class UserController(val repository: UserRepository) {
    @GetMapping("/user/{userId}")
    fun getUserById(@PathVariable userId: Long): User = repository.findByUserId(userId)
}

