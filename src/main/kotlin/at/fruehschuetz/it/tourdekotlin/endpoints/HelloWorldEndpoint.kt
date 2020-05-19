package at.fruehschuetz.it.tourdekotlin.endpoints

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class HelloController {

    @GetMapping("/hello")
    fun helloKotlin(): Map<String, String> {
        return mapOf("message" to "Hello world")
    }
}