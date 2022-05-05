package com.sunglowsys.test;

import com.sunglowsys.bean.Address;
import com.sunglowsys.bean.Employee;
import com.sunglowsys.controller.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee employee = (Employee) context.getBean(Employee.class);
        employee.setId(Long.valueOf("1001"));
        employee.setFirstName("Amit");
        employee.setLastName("Kumar");
        employee.setEmail("amit@gmail.com");
        employee.setMobile("8989898989");
        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getEmail());
        System.out.println(employee.getMobile());
        Address address = context.getBean(Address.class);
        Address address1 = context.getBean(Address.class);
        address.setAddressLine1("Bhavan Nagar");
        address.setAddressLine2("Marehra");
        address.setStreet("Mohanpur");
        address.setCity("Etha");
        address.setZipCode("207401");
        System.out.println(address.getAddressLine1());
        System.out.println(address.getAddressLine2());
        System.out.println(address.getStreet());
        System.out.println(address.getCity());
        System.out.println(address.getZipCode());
        System.out.println(address.hashCode());
        System.out.println(address1.hashCode());
    }
}
