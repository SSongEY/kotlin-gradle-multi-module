package com.example.apiserver2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.example"])
class ApiServer2Application

fun main(args: Array<String>) {
	runApplication<ApiServer2Application>(*args)
}
