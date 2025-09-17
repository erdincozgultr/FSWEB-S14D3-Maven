package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getName() + "'s electric motor is starting. Battery size: " + batterySize + " kWh.");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is driving silently on electric power. Average range: " + avgKmPerCharge + " km per charge.");
        runEngine();
    }
}
