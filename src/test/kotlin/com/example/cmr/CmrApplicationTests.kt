package com.example.cmr

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc


@SpringBootTest
@AutoConfigureMockMvc
class CmrApplicationTests {
	@Autowired
	lateinit var mockMvc: MockMvc

	@Test
	fun createUser() {
	}

	mockMvc.perform(RestDocumentationRequestBuilders.post("/api/users")
	.contentType("application/json")
	.content("{\"fullName\":\"John Doe\",\"age\":\"25\",\"diagnosis\":\"diagnosis\"}"))
	.andExpect(MockMvcResultMatchers.status().isOk)
	.andDo(MockMvcRestDocumentation.document("create-user"))
	.andExpect(MockMvcResultMatchers.jsonPath("$.status").value("success"))
	.andExpect(MockMvcResultMatchers.jsonPath("$.data.fullName").value("John Doe"))
	.andExpect(MockMvcResultMatchers.jsonPath("$.data.age").value("25"))
	.andExpect(MockMvcResultMatchers.jsonPath("$.data.diagnosis").value("diagnosis"))
	}
 }
