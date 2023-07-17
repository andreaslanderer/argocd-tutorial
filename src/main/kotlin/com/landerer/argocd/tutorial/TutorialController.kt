package com.landerer.argocd.tutorial

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/tutorial")
class TutorialController {

    @GetMapping
    fun greeting(@RequestParam name: String) = "Hello, $name!"
}