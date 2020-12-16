package service;

import data.ProductRepository;
import model.Cart;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service("cartService")
public class CartServiceImpl implements CartService{
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private Cart cart;

    @Override
    public void addProduct(Long id) {
        Product product = productRepository.getProductById(id);
        cart.addProduct(product);
    }

    @Override
    public void deleteProduct(Long id) {
    cart.deleteProduct(productRepository.getProductById(id));
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.getProducts();
    }

    @Override
    public Collection<Product> getCartProducts() {
        return cart.getProducts();
    }
}
