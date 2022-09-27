package com.app.api.posttest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
class PostTestControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("/posts 요청 시 Hello World를 출력한다.")
	void gettTest() throws Exception {
		// expected
		mockMvc.perform(get("/posts"))
			.andExpect(status().isOk())
			.andExpect(content().string("Hello World"))
			.andDo(print());
	}

	@Test
	@DisplayName("/posts 요청 시 Hello World를 출력한다.")
	void postTest() throws Exception {
		// expected
		mockMvc.perform(post("/posts")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"title\": \"제목입니다.\", \"content\" : \"내용입니다\"}")
			)
			.andExpect(status().isOk())
			.andExpect(content().string("Hello World"))
			.andDo(print());
	}
}
