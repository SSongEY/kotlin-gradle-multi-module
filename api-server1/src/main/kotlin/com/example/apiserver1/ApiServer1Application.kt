package com.example.apiserver1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.example"])
class ApiServer1Application

fun main(args: Array<String>) {
	runApplication<ApiServer1Application>(*args)
}
