package service;

import model.Product;

import java.util.Collection;
import java.util.List;

public interface CartService {
    void addProduct(Long id );
    void deleteProduct(Long id);
    List<Product> getProducts();
    Collection<Product> getCartProducts();
}
