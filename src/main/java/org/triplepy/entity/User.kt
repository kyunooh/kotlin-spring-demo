package org.triplepy.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by jelly on 11/01/2017.
 */
@Entity
open class User (
    var name: String = "",
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    var userId: Long = 0
)