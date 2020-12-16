package model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Component("cart")
@Scope("prototype")
public class Cart {
    private Map<Long, Product> items;

    public Cart() {
        this.items = new HashMap<>();
    }

    public void addProduct(Product product){
        items.put(product.getId(), product);
    }
    public void deleteProduct(Product product){
        items.remove(product.getId());
    }
    public Collection<Product> getProducts(){
        return items.values();
    }
}
