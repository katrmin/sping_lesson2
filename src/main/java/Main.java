import config.JavaConfig;
import model.Cart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import service.CartService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        CartService cartService = context.getBean("cartService", CartService.class);

        System.out.println("Получить  добавить товары в корзину - 2 id, удалить товар из корзины - 3 id, список продуктов - 4, список товаров в корзине - 5");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            String command = sc.nextLine();
            String[] parts = command.split(" ");
            switch (parts[0]) {
//                case 1: cart = context.getBean("cart", Cart.class);
//                        break;
                case "2":
                    cartService.addProduct(Long.parseLong(parts[1]));
                    break;
                case "3":
                    cartService.deleteProduct(Long.parseLong(parts[1]));
                    break;
                case "4":
                    System.out.println(cartService.getProducts());
                    break;
                case "5":
                    System.out.println(cartService.getCartProducts());
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
