package com.xml_config.ezee_transport;

import com.xml_config.ezee_transport.model.Booking;
import com.xml_config.ezee_transport.service.TransportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-ezee_transport.xml");
        Booking booking = context.getBean("booking", Booking.class);
        TransportService service = context.getBean("transportService", TransportService.class);
        try {
            service.registerBooking(booking);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
