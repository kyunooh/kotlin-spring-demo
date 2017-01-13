package org.triplepy.entity

import java.util.*
import javax.persistence.*

/**
 * Created by jelly on 11/01/2017.
 */
@Entity
open class Note (
    @ManyToOne
    var author: User = User(),
    var title: String = "",
    var contents: String = "",
    var joinDate: Date = Date(),
    var views: Long = 0,

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    var noteId: Long = 0
)