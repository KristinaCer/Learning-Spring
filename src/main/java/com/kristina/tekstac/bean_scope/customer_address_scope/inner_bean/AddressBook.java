package com.kristina.tekstac.bean_scope.customer_address_scope.inner_bean;

public class AddressBook {
    private String phoneNumber;

    public AddressBook(Address tempAddress) {
        this.tempAddress = tempAddress;
    }

    private Address tempAddress;
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getTempAddress() {
       return tempAddress; }

    public void setTempAddress(Address tempAddress) {
        this.tempAddress = tempAddress;
    }

    @Override
    public String toString() {
        return "Temporary address"+ "\n" +"House name:"+ tempAddress.getHouseName()+ "\n" +"Street:"
                +tempAddress.getStreet()+"\n"+"City:" + tempAddress.getCity() +"\n"+
                "State:" + tempAddress.getState()+"\n"+"Phone number:" + phoneNumber;
    }
}

