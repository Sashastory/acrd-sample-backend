package ru.iitdgroup.acrdsamplebackend.repository

import org.springframework.data.repository.CrudRepository
import ru.iitdgroup.acrdsamplebackend.model.Transaction
import java.util.*

interface TransactionRepository : CrudRepository<Transaction, Long> {

    override fun findAll(): MutableIterable<Transaction>

    override fun findById(id: Long): Optional<Transaction>

    fun findByCardNumber(cardNumber: String): Optional<Transaction>

}