package se.lexicon;

import java.util.Arrays;

public class Person {
    // Filed:
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private Car[] carsOwned;

    // Constructors:
    public Person(String name, String phoneNumber, String address) {
        setName(name); //this.name = name;
        setPhoneNumber(phoneNumber); //this.phoneNumber = phoneNumber;
        setAddress(address);  //this.address = address;
        this.carsOwned = new Car[0];
    }

    public Person(String name, String phoneNumber, String email, String address) {
        this(name, phoneNumber,address); //this.name = name; this.phoneNumber = phoneNumber; this.address = address;*/
        setEmail(email); // this.email = email;
    }

    // Methods:

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // todo: add validation
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        // todo: add validation
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // todo: add validation
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        // todo: add validation
        this.address = address;
    }

    public void displayInfo(){
        System.out.println("PersonInfo -> Name: " + name + ", PhoneNumber: " + phoneNumber + ", Email: " + email + ", Address: " + address + ", NumberOfCars: " + carsOwned.length);
    }

    public void registerCarOwnership(Car car){
        carsOwned = Arrays.copyOf(carsOwned, carsOwned.length + 1);
        carsOwned[carsOwned.length - 1 ] = car;
        car.setOwner(this);
    }

    public void unregisterCarOwnership(Car car){
        // todo: need to complete.
        // find car index.
        // create a new array with length - 1
        // iterate on array and add all cars except the param
        // car.setOwner(null);
    }
}
