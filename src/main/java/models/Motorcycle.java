package models;

public class Motorcycle extends Vehicles
{
    public Motorcycle(String brand, String model){
        super(brand,model);
    }

    @Override
    public void move(){

        System.out.println(" The motorcycle " +getBrand()+ " Model " +getModel()+ " is moving rapidly through the street ");
    }

}
