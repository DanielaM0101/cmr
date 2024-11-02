package com.example.cmr

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CmrApplication

fun main(args: Array<String>) {
	runApplication<CmrApplication>(*args)
}
