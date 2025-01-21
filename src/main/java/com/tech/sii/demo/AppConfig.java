package com.tech.sii.demo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.tech.sii.demo.ejb.EmployeeSessionBean;

@Configuration
@ComponentScan(basePackages = "com.tech.sii.demo.ejb")
public class AppConfig {
    @Bean
    public EmployeeSessionBean EmployeeSessionBean() {
      return new EmployeeSessionBean();
    }
}
