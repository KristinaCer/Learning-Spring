package com.ezee_transport;

import com.ezee_transport.model.Booking;
import com.ezee_transport.service.TransportService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\krist\\OneDrive\\Documents\\GitHub\\spring\\src\\main\\java\\com\\kristina\\tekstac\\ezee_transport\\bean-ezee_transport.xml");
        Booking booking = context.getBean("booking", Booking.class);
        TransportService service = context.getBean("transportService", TransportService.class);
        try {
            service.registerBooking(booking);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
