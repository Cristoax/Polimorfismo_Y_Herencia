package models;

public class Car extends Vehicles implements Fuel
{

    public Car (String brand, String model)
    {
        super(brand, model);
    }

    @Override
    public void move()
    {
        System.out.println();
        System.out.println(" The car " +getBrand()+ " Model " +getModel()+ " is moving through the streets ");
    }

    @Override

    public void refuel()
    {
        System.out.println(" The car " +getBrand()+ " Model " +getModel()+  " Is refueling");

    }
}