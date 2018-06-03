package ru.iitdgroup.acrdsamplebackend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import ru.iitdgroup.acrdsamplebackend.repository.TransactionRepository

@RestController
class TransactionController(private val repository: TransactionRepository) {

    @GetMapping("/transactions")
    fun findAll() = repository.findAll()

    @GetMapping("/transactions/{id}")
    fun findById(@PathVariable id: Long) = repository.findById(id)

}