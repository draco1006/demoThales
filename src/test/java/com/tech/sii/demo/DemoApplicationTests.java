package com.tech.sii.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tech.sii.demo.ejb.EmployeeSessionBean;

@SpringBootTest
class DemoApplicationTests {
	private final EmployeeSessionBean employeeService = new EmployeeSessionBean();
	@Test
	void contextLoads() {
	}

	@Test
	void testEmployeeBean() {
		int i = employeeService.anualSalary(12);
		assertEquals(144, i);
	}
	

}
