package at.fruehschuetz.it.tourdekotlin

import io.restassured.RestAssured
import io.restassured.module.kotlin.extensions.Extract
import io.restassured.module.kotlin.extensions.Given
import io.restassured.module.kotlin.extensions.Then
import io.restassured.module.kotlin.extensions.When
import org.hamcrest.CoreMatchers.equalTo
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.test.context.junit.jupiter.SpringExtension
import kotlin.properties.Delegates

@ExtendWith(SpringExtension::class)
@SpringBootTest(
        classes = [TourDeKotlinApplication::class],
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class KotlinDemoApplicationIntegrationTest {

    @set:LocalServerPort
    var port by Delegates.notNull<Int>()

    @Test
    fun whenCalled_shouldReturnHello() {

        val response = Given  {
            port(port)
        } When {
            get("/hello")
        } Then {
            statusCode(200)
            body("message", equalTo("Hello world"))
        } Extract {
            response()
        }

    }

}