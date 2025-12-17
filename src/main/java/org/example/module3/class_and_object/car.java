package org.example.module3.class_and_object;

public class car {
    int mileage;
    String color;
    int model;
    int companyName;

    car() {
    }


    void start() {
        System.out.println("Car started");
    }

    void stop() {
        System.out.println("Car stopped");
    }

    int getTripMileage(int distance, int fuelConsumed) {
        System. out.println("Trip mileage is: " + (distance / fuelConsumed) * mileage + " km/l");
        return 10;
    }

    public static void main(String[] args) {
        // altoK10, bmw are objects (real world entity)
        // Car is a class (blueprint) to create object
        car altoK10 = new car();
        car bmw = new car();
    }
}
