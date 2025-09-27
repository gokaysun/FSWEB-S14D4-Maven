package org.example.model;

public class Store {

    public void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        // Chocolate, Coke, Bread objeleri oluşturuluyor
        Chocolate chocolate = new Chocolate("Milk Chocolate", 5.0, "Sweet and creamy");
        Coke coke = new Coke("Coca Cola", 3.5, "Refreshing soda");
        Bread bread = new Bread("Whole Wheat Bread", 2.5, "Healthy bread");

        // ProductForSale dizisi oluşturuluyor
        ProductForSale[] products = {chocolate, coke, bread};

        // Store objesi oluşturup listProducts metodunu çağırıyoruz
        Store store = new Store();
        store.listProducts(products);
    }
}
