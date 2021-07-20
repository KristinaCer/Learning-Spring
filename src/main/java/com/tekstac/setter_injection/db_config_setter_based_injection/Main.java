package com.tekstac.setter_injection.db_config_setter_based_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config-tekstac-hands-ons.xml");
        EmployeeDAO employeeDAO = context.getBean("empDaoObj", EmployeeDAO.class);
        employeeDAO.getDbConfig();
    }
}
