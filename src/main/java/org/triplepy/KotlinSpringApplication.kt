package org.triplepy

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.triplepy.entity.Note
import org.triplepy.entity.User
import org.triplepy.repository.NoteRepository
import org.triplepy.repository.UserRepository
import java.util.*

@SpringBootApplication
open class KotlinSpringApplication {
    @Bean
    open fun init(userRepository: UserRepository, noteRepository: NoteRepository) = CommandLineRunner {
        val jelly = User("젤리")
        userRepository.save(jelly)
        userRepository.save(User("현디"))
        userRepository.save(User("강산"))
        noteRepository.save(Note(jelly, "This is title", "Conteis is tints Contents", Date()))
        noteRepository.save(Note(jelly, "This is title", "Contents Contents", Date()))
        noteRepository.save(Note(jelly, "This is tiis is title", "Contents Contents", Date()))
        noteRepository.save(Note(jelly, "This is title", "Contents Contents", Date()))
        noteRepository.save(Note(jelly, "This is title", "Cois is tintents Contents", Date()))
        noteRepository.save(Note(jelly, "This is title", "Contents Contents", Date()))
        noteRepository.save(Note(jelly, "This is title", "Contents Cis is tiontents", Date()))
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringApplication::class.java, *args)
}
