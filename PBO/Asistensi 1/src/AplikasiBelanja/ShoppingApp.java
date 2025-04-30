/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiBelanja;

/**
 *
 * @author Legion 5 Pro
 */
import java.util.*;

public class ShoppingApp {
    private Scanner scanner = new Scanner(System.in);
    private UserService userService = new UserService();
    private ProductService productService = new ProductService();
    private OrderService orderService = new OrderService();

    public void run() {
        while (true) {
            Utils.clearScreen();
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Product Catalog");
            System.out.println("4. Exit");
            System.out.print("Pilih: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    userService.signUp(scanner);
                    break;
                case "2":
                    User user = userService.signIn(scanner);
                    if (user != null) {
                        handleSignedInMenu(user);
                    }
                    break;
                case "3":
                    productService.showProducts();
                    Utils.pause(scanner);
                    break;
                case "4":
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
                    Utils.pause(scanner);
            }
        }
    }

    private void handleSignedInMenu(User user) {
        while (true) {
            Utils.clearScreen();
            System.out.println("=== MENU AKUN ===");
            System.out.println("1. Sign Out");
            System.out.println("2. Product Catalog");
            System.out.println("3. Product Management");
            System.out.print("Pilih: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    return;
                case "2":
                    productService.handleCatalog(scanner, user);
                    break;
                case "3":
                    orderService.handleOrders(scanner, user, productService);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    Utils.pause(scanner);
            }
        }
    }
}

