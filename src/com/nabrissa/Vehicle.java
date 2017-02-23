package com.nabrissa;

/**
 * Created by lucasjcastro on 23/2/17.
 */
public class Vehicle {

    private String vehicleType;
    private int publicTransport;
    private int needDriver;

    public Vehicle(String vehicleType, int publicTransport, int needDriver) {

        this.vehicleType = vehicleType;
        this.publicTransport = publicTransport;
        this.needDriver = needDriver;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getPublicTransport() {
        return publicTransport;
    }

    public int getNeedDriver() {
        return needDriver;
    }

}
