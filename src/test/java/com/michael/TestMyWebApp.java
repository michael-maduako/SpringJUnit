package com.michael;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class TestMyWebApp extends SpringJUnitApplicationTests {
	@Autowired
	private WebApplicationContext ctx;
	
	private MockMvc mock;
	@Before
	
	public void setup() {
		mock=MockMvcBuilders.webAppContextSetup(ctx).build();
	}
	
	@Test
	public void testMyEmp() throws Exception {
		mock.perform(get("/emp"))
		.andExpect(status().isOk())
		.andExpect(content().contentType("application/json;charset=UTF-8"))
		.andExpect(jsonPath("$.empName").value("Michael"))
		.andExpect(jsonPath("$.empSal").value(12345));
	}
	
}
