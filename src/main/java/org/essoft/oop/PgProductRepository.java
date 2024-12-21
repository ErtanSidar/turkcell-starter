package org.essoft.oop;

import java.util.List;

public class PgProductRepository implements ProductRepository {
    @Override
    public void addProduct(Product product) {
        System.out.println("PgProduct added");
    }

    @Override
    public List<Product> getAllProducts() {
        Product product = new Product("Product 1", 100, 10);
        Product product2 = new Product("Product 2", 100, 10);
        List<Product> products = List.of(product, product2);
        return products;
    }
}
