package org.essoft.oop;

import java.util.List;

public interface ProductRepository {

    public void addProduct(Product product);

    public List<Product> getAllProducts();
}
