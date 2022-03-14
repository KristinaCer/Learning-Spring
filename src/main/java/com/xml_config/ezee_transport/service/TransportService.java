package com.xml_config.ezee_transport.service;

import com.xml_config.ezee_transport.model.Booking;
import com.xml_config.ezee_transport.model.Vehicle;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class TransportService {
    private Vehicle vehicle;
    private Booking booking;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {

        this.booking = booking;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {

        this.vehicle = vehicle;
    }

    public void registerBooking(Booking booking) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Customer Name");
        String name = sc.nextLine();
        System.out.println("Enter the Mobile Number");
        long phNo = Long.parseLong(sc.nextLine());
        System.out.println("Enter the Destination");
        String dest = sc.nextLine();
        System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
        String date = sc.nextLine().trim();
        sc.close();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date journeyDate = sdf.parse(date);

        booking.setCustomerName(name);
        booking.setMobileNumber(phNo);
        booking.setDestination(dest);
        booking.setDateOfJourney(journeyDate);

        calculateTravelCost(vehicle.getSource(), booking.getDestination(), booking.getDateOfJourney());

    }

    public void calculateTravelCost(String source, String destination, Date doj) {
        // code here
        if (checkAvailableDateForTravel(doj)) {
            System.out.println("Total Travel Cost is Rs." + getCost(destination));
        } else {
            System.out.println("Invalid Travel Date");
        }
    }

    public boolean checkAvailableDateForTravel(Date doj) {
        // code here
        int today = Calendar.getInstance().getTime().getDate();
        int tmr = today + 1;
        if (doj.getDate() == today || doj.getDate() == tmr) {
            return true;
        } else {
            return false;
        }
    }

    public double getCost(String destination) {
        // code here
        if (this.vehicle.getDestinationMap().containsKey(destination)) {
            return this.vehicle.getDestinationMap().get(destination);
        } else {
            return 0.0;
        }
    }
}
