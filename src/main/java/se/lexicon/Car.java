package se.lexicon;

import java.time.LocalDate;
import java.util.UUID;

public class Car

{
    // Fields
    private String registrationNumber;
    String brand;
    String model;
    int year;
    private Person owner;

    public Person getOwner() {
        return this.owner;
    }

    public void setOwner(Person owner) {
        if(owner == null) throw new IllegalArgumentException("Owner should net be null");
        this.owner = owner;
    }

    // Constructors
    public Car(){
        this.registrationNumber = getRegistrationNumber();
    };

    public Car(String brand, String model){
        this(brand, model, LocalDate.now().getYear());
    }

    public Car(String brand, String model, int year){
        setBrand(brand);
        setModel(model);
        this.year = year;
        this.registrationNumber = getRegistrationNumber();
    }

    // Methods
    public void setBrand(String brand){
        if (brand == null || brand.trim().isEmpty()){
            throw new IllegalArgumentException("Brand cannot br null or empty");
        }
        this.brand = brand;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setModel(String model){
        if (model == null || model.trim().isEmpty()){
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public int getYear() {
        return year;
    }

    public void displayInfo(){
        System.out.print("Car Info: Registration Number: " + registrationNumber + " , Brand: " + brand + ", Model: "+ model + " , Year: " + year);
        if (owner != null) {
            System.out.print(", Owner Name: " + owner.getName() + ".");
        }
        else {
            System.out.print(", No owner assigned.");
        }
        System.out.println();
    }

    private String getRegistrationNumber(){
        return UUID.randomUUID().toString().substring(0,8).toUpperCase();
    }
}
