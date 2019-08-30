package com.joshiraez.tictactoetdd.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class PlayEndpointShould {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `return empty board when no info is given`() {

        //When
        val responseBody = mockMvc.perform(get("/v1/play"))
                .andExpect(status().isOk)
                .andReturn().response.contentAsString

        //Then
        assertThat(responseBody).isEqualToIgnoringWhitespace("""{"board":[[" "," "," "],[" "," "," "],[" "," "," "]]}""")
    }
}
