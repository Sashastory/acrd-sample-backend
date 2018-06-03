package ru.iitdgroup.acrdsamplebackend.model

import java.time.LocalDateTime

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Transaction(
        val cardNumber: String,
        val dateTime: LocalDateTime,
        val otv: Number,
        val amount: Number,
        val currency: Number,
        val operationCode: String,
        val rules: String,
        val score: Number,
        val city: String,
        val category: Number,
        val institute: Number,
        val merchantName: String,
        val terminalId: Number,
        @Id @GeneratedValue
        val id: Long = -1)
