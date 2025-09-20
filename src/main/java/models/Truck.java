package models;

public class Truck extends Vehicles implements Fuel {

    public Truck(String brand, String model {
        super(brand, model);
    }

    @Override
    public void move() {
        System.out.println("The truck " + getBrand() + " Carries heavy cargo.");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling diesel for the truck " + getBrand()+ " Model " +getModel());

    }
}