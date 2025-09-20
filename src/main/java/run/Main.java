package run;

import models.*;

public class Main {
    public static void main(String[] args) {
        Vehicles[] fleet = new Vehicles[]{
                new Car ("Mitsubishi", "Outlander"),
                new Motorcycle ("BMW", "Maxitrail"),
                new Truck ("Mercedes-Benz", "VITO") };
        for (Vehicles v : fleet) {
            v.move();

            if (v instanceof Fuel) {
                ((Fuel) v).refuel();
            }

            v.ShowInfo();
            System.out.println();
        }
    }
}
