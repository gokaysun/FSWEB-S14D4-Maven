package org.example.model;

public abstract class ProductForSale {
    // Private instance variable'lar
    private String type;
    private double price;
    private String description;

    // Constructor
    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    // Getter metodları
    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // Miktara göre satış fiyatı hesaplayan metod
    public double getSalesPrice(int quantity) {
        return price * quantity;
    }

    // Abstract metod: detayları gösterecek
    public abstract void showDetails();
}
