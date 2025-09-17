package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize, cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + "'s hybrid system is starting. It combines a gas engine and an electric motor.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving in hybrid mode. Battery size: " + batterySize + " kWh, Cylinders: " + cylinders + ".");
        runEngine();
    }
}
