package org.triplepy.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.triplepy.entity.Note
import org.triplepy.repository.NoteRepository

/**
 * Created by jelly on 11/01/2017.
 */
@RestController
class NoteController (val repository: NoteRepository) {

    @GetMapping("/note/{noteId}")
    fun getNote(@PathVariable noteId: Long): Note = repository.findByNoteId(noteId)

}