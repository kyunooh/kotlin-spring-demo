package org.triplepy.repository

import org.springframework.data.repository.CrudRepository
import org.triplepy.entity.Note

/**
 * Created by jelly on 11/01/2017.
 */
interface NoteRepository : CrudRepository<Note, Long> {
    fun findByNoteId(noteId: Long): Note
}