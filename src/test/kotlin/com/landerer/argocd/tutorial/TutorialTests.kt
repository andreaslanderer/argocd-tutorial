package com.landerer.argocd.tutorial

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(TutorialController::class)
class TutorialTests(@Autowired private val mvc: MockMvc) {

    @Test
     fun `should return greeting`() {
         mvc.perform(get("/tutorial").param("name", "test"))
             .andExpect(status().isOk())
             .andExpect(content().string("Hello, test!"))
     }
// generate another WebMVC test without param resulting in a status code 400
    @Test
    fun `should return bad request`() {
        mvc.perform(get("/tutorial"))
            .andExpect(status().isBadRequest())
    }
}