package com.sunglowsys.controller;

import com.sunglowsys.bean.Address;
import com.sunglowsys.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

    @Bean
    public Employee getEmployee() {
        return new Employee();

    }

    @Bean
    public Address getAddress() {

        return new Address();
    }
}
