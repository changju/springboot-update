package com.study.springboot;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

// junit5 부터 @RunWith 를 안쓴다.
// junit5 부터 class 에 public 을 생략해도 된다.
// junit5 부터 그냥 @SpringBootTest 라 쓴다.

// @SpringBootTest 에 이미 @ExtendWith({SpringExtends.class}) 가 되어 있기에
//  @RunWith 를 하지 않아도 된다.
@SpringBootTest
@AutoConfigureMockMvc
class HelloControllerTest {
	
	@Autowired
	MockMvc mockMvc;

	@Test
	void testHello() throws Exception {
		mockMvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string("hello"));

	}

	// 두개의 결과를 모두 확인한다.
	// junt4 에서는 하나가 실패하면 멈췄으나 아래처럼 하면 모두 수행 가능하다.
	@Test
	void testHello2() throws Exception {
		ResultActions resultActions = mockMvc.perform(get("/hello"));

		Assertions.assertAll(() -> resultActions.andExpect(status().isOk()),
				() -> resultActions.andExpect(content().string("hello")));
		

	}

}
