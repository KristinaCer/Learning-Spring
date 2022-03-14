package com.xml_config.setter_injection.concurency_converter_collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("concurrency-converter.xml");
        CurrencyConverter currencyConverter = context.getBean("currencyConverter",CurrencyConverter.class);
        System.out.println(currencyConverter.getTotalCurrencyValue("EURO"));
        context.close();
    }
}
