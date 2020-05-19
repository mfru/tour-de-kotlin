package at.fruehschuetz.it.tourdekotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TourDeKotlinApplication

fun main(args: Array<String>) {
    runApplication<TourDeKotlinApplication>(*args)
}
