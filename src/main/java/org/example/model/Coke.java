package org.example.model;

public class Coke extends ProductForSale {
    private double volume; // litre cinsinden

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Volume: " + volume + "L");
        System.out.println("---------------------------");
    }
}
