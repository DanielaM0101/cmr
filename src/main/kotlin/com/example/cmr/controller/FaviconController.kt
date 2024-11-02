package com.example.cmr.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths

@Controller
class FaviconController {
    @GetMapping("favicon.ico")
    @ResponseBody
    fun favicon():ByteArray{
        val path: Path = Paths.get("src/main/resources/static/favicon.ico")
        return Files.readAllBytes(path)
    }
}