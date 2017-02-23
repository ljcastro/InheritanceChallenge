package com.nabrissa;

public class Main {

    public static void main(String[] args) {

        // Challenge
        // Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        // Finally, create another class, a specific type of Car that inherits from the Car class.
        // You should be able to hand steering, changing gears, and moving (speed in other words).
        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
        // As mentioned above, changing gears, increasing/decreasing speed should be included.
        // For your specific type of vehicle you will want to add something specific for that type of car.

        Sedan bmw520 = new Sedan(4,
                "Diesel",
                "Automatic",
                "BMW",
                "520D",
                2000,
                177);

        bmw520.move(60);
        bmw520.changeGear(5);
        bmw520.steering("Right");

        System.out.println(bmw520.getCombustion());
        System.out.println(bmw520.getNeedDriver());
        System.out.println(bmw520.getVehicleType());
        System.out.println(bmw520.getBrand());

    }
}
