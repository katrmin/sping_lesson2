package data;

import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> products;

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    @Autowired
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @PostConstruct
    private void init(){
        products = Arrays.asList(
                new Product(1L, "Product 1", BigDecimal.valueOf(100.1)),
                new Product(2L, "Product 2", BigDecimal.valueOf(100.2)),
                new Product(3L, "Product 3", BigDecimal.valueOf(100.3)),
                new Product(4L, "Product 4", BigDecimal.valueOf(100.4)),
                new Product(5L, "Product 5", BigDecimal.valueOf(100.5))
        );
    }

    public Product getProductById(Long id){
        return products.stream().filter(product -> product.getId().equals(id)).findFirst().get();
    }
}
