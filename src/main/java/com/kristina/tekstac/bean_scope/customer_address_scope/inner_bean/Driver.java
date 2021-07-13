package com.kristina.tekstac.bean_scope.customer_address_scope.inner_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Driver {
    public static AddressBook loadAddressBook()
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AddressBook book = ctx.getBean("addressBook", AddressBook.class);
        return book;
    }

    public static void main(String[] args)
    {
        //invoke the loadAddressBook() method from main retrieve the AddressBook object, get the details from the user set the values and display the values
        AddressBook book = loadAddressBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temporary address");
        System.out.println("Enter the house name");
        String hName = sc.nextLine();
        System.out.println("Enter the street");
        String street = sc.nextLine();
        System.out.println("Enter the city");
        String city = sc.nextLine();
        System.out.println("Enter the state");
        String state = sc.nextLine();
        System.out.println("Enter the phone number");
        String phoneNo =sc.nextLine();
        Address tempAdd = book.getTempAddress();
        tempAdd.setHouseName(hName);
        tempAdd.setStreet(street);
        tempAdd.setCity(city);
        tempAdd.setState(state);
        book.setTempAddress(tempAdd);
        book.setPhoneNumber(phoneNo);
        System.out.println( book.toString());

    }
}
