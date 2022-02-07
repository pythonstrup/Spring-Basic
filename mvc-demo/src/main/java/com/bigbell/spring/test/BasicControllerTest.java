package com.bigbell.spring.test;

import javax.swing.Spring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.bigbell.spring.controller.BasicController;

public class BasicControllerTest {
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new BasicController()).build();
	}
	
//	@Test
//	public void basicTest() throws Exception {
//		this.mockMvc.perform(
//				get("/welcome")
//				.accept(MediaType.parseMediaType("application/html;charset=UTF-8")))
//			.andExpect(status().isOk())
//			.andExpect(content().contentType("application/html;charset=UTF-8"))
//			.andExpect(Content().string("Welcome to Spring MVC"));
//	}
}
