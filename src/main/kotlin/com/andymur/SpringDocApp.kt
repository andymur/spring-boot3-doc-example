package com.andymur

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@OpenAPIDefinition
open class SpringDocApp
fun main(args: Array<String>) {
    runApplication<SpringDocApp>(*args)
}