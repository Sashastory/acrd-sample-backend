package ru.iitdgroup.acrdsamplebackend

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import ru.iitdgroup.acrdsamplebackend.model.Transaction
import ru.iitdgroup.acrdsamplebackend.repository.TransactionRepository
import java.time.LocalDate
import java.time.LocalDateTime

@SpringBootApplication
class AcrdSampleBackendApplication {

    private val logger = LoggerFactory.getLogger(AcrdSampleBackendApplication::class.java)

    @Bean
    fun init(repository: TransactionRepository) = CommandLineRunner {
        repository.save(Transaction("5222123456784567", LocalDateTime.parse("2017-06-04T01:01:44.123"),
                                    246, 0.50, 810, "ZU", "", 73, "MOSCOW",
                                    6010, 211221, "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784568", LocalDateTime.parse("2016-06-04T02:02:33.326"),
                                    246, 0.50, 810, "ZU", "", 73, "MOSCOW",
                                    6010, 211221, "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784561", LocalDateTime.parse("2015-06-04T03:03:22.457"),
                                    246, 0.50, 810, "ZU", "", 73, "MOSCOW",
                                    6010, 211221, "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784562", LocalDateTime.parse("2014-06-04T04:04:59.145"),
                                    246, 0.50, 810, "ZU", "", 73, "MOSCOW",
                                    6010, 211221, "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784563", LocalDateTime.parse("2013-06-04T05:05:59.780"),
                                    246, 0.50, 810, "ZU", "", 73, "MOSCOW",
                                    6010, 211221, "TEST AMEX RS IP", 123456789))

        repository.save(Transaction("5222123456784564", LocalDateTime.now(), 246, 0.50,
                                    810, "ZU", "", 73, "MOSCOW", 6010,
                                    211221, "TEST AMEX RS IP", 123456789))

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
