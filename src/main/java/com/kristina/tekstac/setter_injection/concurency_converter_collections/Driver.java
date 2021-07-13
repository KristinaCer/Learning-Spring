package com.kristina.tekstac.setter_injection.concurency_converter_collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CurrencyConverter currencyConverter = context.getBean("currencyConverter",CurrencyConverter.class);
        context.close();

    }
}
