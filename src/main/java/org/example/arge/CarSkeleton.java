package org.example.arge;

public class CarSkeleton {
    private String name, description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println("Starting the engine of the car...");
    }

    public void drive() {
        System.out.println("Driving the car...");
        runEngine();
    }

    protected void runEngine() {
        System.out.println("The engine is running smoothly.");
    }
}
