package ru.iitdgroup.acrdsamplebackend.controller

import org.springframework.web.bind.annotation.*
import ru.iitdgroup.acrdsamplebackend.model.Transaction
import ru.iitdgroup.acrdsamplebackend.repository.TransactionRepository
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

@RestController
@CrossOrigin("*")
class TransactionController(private val repository: TransactionRepository) {

    @GetMapping("/transactions")
    fun findAll() = repository.findAll()

    @GetMapping("/transactions/{id}")
    fun findById(@PathVariable id: Long) = repository.findById(id)

    @GetMapping("/transactions/transaction", params = ["cardNumber"])
    fun findByCardNumber(cardNumber: String) = repository.findByCardNumberContaining(cardNumber)

    @GetMapping("/transactions/transaction", params = ["dateBefore"])
    fun findByDateTimeBefore(dateBefore: String) = repository.findByDateTimeBefore(LocalDateTime.parse(dateBefore))

    @GetMapping("/transactions/transaction", params = ["dateAfter"])
    fun findByDateTimeAfter(dateAfter: String) = repository.findByDateTimeAfter(LocalDateTime.parse(dateAfter))

}