package com.tech.sii.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.tech.sii.demo.ejb.EmployeeSessionBean;

@SpringBootTest
@AutoConfigureMockMvc
public class EmployeeControllerTest {
    @Autowired
    private MockMvc mockEmployee;

    @Test
    void testGetEmployee() throws Exception {
        mockEmployee.perform(get("/id").param("id", "1"))
            .andExpect(status().isOk())
            .andExpect(content().string("{\"anual_salary\":3849600,\"id\":1,\"employee_age\":61,\"employee_salary\":320800,\"employee_name\":\"Tiger Nixon\",\"profile_image\":\"\"}"));
    }
}
