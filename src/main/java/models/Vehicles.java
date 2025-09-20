package models;

public abstract class Vehicles {
    private String brand;
    private String model;

    public Vehicles(String brand, String model)
    {
        this.brand = brand;
        this.model = model;
    }

    public abstract void move();

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }

    public void ShowInfo()
    {
        System.out.println(" Brand: " + getBrand());
        System.out.println(" Model: " + getModel());
    }

}
