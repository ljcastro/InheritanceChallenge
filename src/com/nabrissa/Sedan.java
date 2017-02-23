package com.nabrissa;

/**
 * Created by lucasjcastro on 23/2/17.
 */
public class Sedan extends Car {

    private String brand;
    private String model;
    private int engineCC;
    private int engineHP;

    public Sedan(int doors, String combustion, String gearbox, String brand, String model, int engineCC, int engineHP) {
        super(0, doors, combustion, "Sedan", gearbox);
        this.brand = brand;
        this.model = model;
        this.engineCC = engineCC;
        this.engineHP = engineHP;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public int getEngineHP() {
        return engineHP;
    }
}
