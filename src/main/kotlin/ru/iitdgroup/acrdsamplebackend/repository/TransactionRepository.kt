package ru.iitdgroup.acrdsamplebackend.repository

import org.springframework.data.repository.CrudRepository
import ru.iitdgroup.acrdsamplebackend.model.Transaction
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

interface TransactionRepository : CrudRepository<Transaction, Long> {

    override fun findAll(): MutableIterable<Transaction>

    override fun findById(id: Long): Optional<Transaction>

    fun findByCardNumberContaining(cardNumber: String): MutableIterable<Optional<Transaction>>

    fun findByDateTimeBefore(dateBefore: LocalDateTime) : MutableIterable<Optional<Transaction>>

    fun findByDateTimeAfter(dateAfter: LocalDateTime) : MutableIterable<Optional<Transaction>>

}