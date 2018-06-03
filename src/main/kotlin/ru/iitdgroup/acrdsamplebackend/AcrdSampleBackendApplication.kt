package ru.iitdgroup.acrdsamplebackend

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import ru.iitdgroup.acrdsamplebackend.model.Transaction
import ru.iitdgroup.acrdsamplebackend.repository.TransactionRepository
import java.time.LocalDateTime

@SpringBootApplication
class AcrdSampleBackendApplication {

    private val logger = LoggerFactory.getLogger(AcrdSampleBackendApplication::class.java)

    @Bean
    fun init(repository: TransactionRepository) = CommandLineRunner {
        repository.save(Transaction("5222123456784567", LocalDateTime.now(), 246, 0.50,
                810, "ZU", "", 73, "MOSCOW", 6010, 211221,
                "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784568", LocalDateTime.now(), 246, 0.50,
                810, "ZU", "", 73, "MOSCOW", 6010, 211221,
                "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784561", LocalDateTime.now(), 246, 0.50,
                810, "ZU", "", 73, "MOSCOW", 6010, 211221,
                "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784562", LocalDateTime.now(), 246, 0.50,
                810, "ZU", "", 73, "MOSCOW", 6010, 211221,
                "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784563", LocalDateTime.now(), 246, 0.50,
                810, "ZU", "", 73, "MOSCOW", 6010, 211221,
                "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784564", LocalDateTime.now(), 246, 0.50,
                810, "ZU", "", 73, "MOSCOW", 6010, 211221,
                "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784565", LocalDateTime.now(), 246, 0.50,
                810, "ZU", "", 73, "MOSCOW", 6010, 211221,
                "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784566", LocalDateTime.now(), 246, 0.50,
                810, "ZU", "", 73, "MOSCOW", 6010, 211221,
                "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784560", LocalDateTime.now(), 246, 0.50,
                810, "ZU", "", 73, "MOSCOW", 6010, 211221,
                "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784517", LocalDateTime.now(), 246, 0.50,
                810, "ZU", "", 73, "MOSCOW", 6010, 211221,
                "TEST AMEX RS IP", 123456789))

        logger.info("Transactions found with findAll():")
        repository.findAll().forEach { logger.info(it.toString()) }

    }

}

fun main(args: Array<String>) {
    runApplication<AcrdSampleBackendApplication>(*args)
}
