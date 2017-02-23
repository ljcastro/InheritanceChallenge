package com.nabrissa;

/**
 * Created by lucasjcastro on 23/2/17.
 */
public class Car extends Vehicle {

    private int doors;
    private String combustion;
    private String type;
    private String gearbox;

    public Car(int publicTransport, int doors, String combustion, String type, String gearbox) {
        super("Car", publicTransport, 1);
        this.doors = doors;
        this.combustion = combustion;
        this.type = type;
        this.gearbox = gearbox;
    }

    public int getDoors() {
        return doors;
    }

    public String getCombustion() {
        return combustion;
    }

    public String getType() {
        return type;
    }

    public String getGearbox() {
        return gearbox;
    }

    public void steering(String direction) {
        System.out.println("Turn " + direction);
    }

    public void changeGear(int gear) {
        System.out.println("Changing gear to " + gear);
    }

    public void move(int speed) {
        System.out.println("Driving at " + speed + " MPH");
    }

}
