/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */
import java.util.*;

public class MainMenu implements InMenu {
    private LogicSystem context;
    private Scanner scanner;

    public MainMenu() {
        this.context = LogicSystem.getInstance();
        this.scanner = new Scanner(System.in);
        context.setMainMenu(this);
    }

    @Override
    public void start() {
        while (true) {
            printMenuHeader();
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.exit(0);
            }
            try {
                int option = Integer.parseInt(input);
                switch (option) {
                    case 1:
                        handleSignUp();
                        break;
                    case 2:
                        handleSignInOrOut();
                        break;
                    case 3:
                        handleProductCatalog();
                        break;
                    case 4:
                        handleMyOrders();
                        break;
                    case 5:
                        handleSettings();
                        break;
                    case 6:
                        handleCustomerList();
                        break;
                    default:
                        System.out.println("Only 1, 2, 3, 4, 5, 6 is allowed. Try one more time.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Only 1, 2, 3, 4, 5, 6 is allowed. Try one more time.");
            }
        }
    }

    @Override
    public void printMenuHeader() {
        System.out.println("=== Main Menu ===");
        System.out.println("1. Sign Up");
        System.out.println("2. " + (context.getLoggedInUser() == null ? "Sign In" : "Sign Out"));
        System.out.println("3. Product Catalog");
        System.out.println("4. My Orders");
        System.out.println("5. Settings");
        System.out.println("6. Customer List");
        System.out.println("Enter 'exit' to stop the program");
    }

    private void handleSignUp() {
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        System.out.println("Enter email:");
        String email = scanner.nextLine();

        InPengguna user = new Pengguna(firstName, lastName, password, email);
        String result = LayananPengguna.getInstance().registerUser(user);
        System.out.println(result);
        if (result.equals("New user is created")) {
            context.setLoggedInUser(user);
        }
    }

    private void handleSignInOrOut() {
        if (context.getLoggedInUser() == null) {
            System.out.println("Enter email:");
            String email = scanner.nextLine();
            System.out.println("Enter password:");
            String password = scanner.nextLine();

            InPengguna user = LayananPengguna.getInstance().getUserByEmail(email);
            if (user != null && user.getPassword().equals(password)) {
                context.setLoggedInUser(user);
                System.out.println("Glad to see you back " + user.getFirstName() + " " + user.getLastName());
            } else {
                System.out.println("Unfortunately, such login and password doesn't exist");
            }
        } else {
            System.out.println("Have a nice day! Look forward to welcoming back!");
            context.setLoggedInUser(null);
        }
    }

    private void handleProductCatalog() {
        InLayananProduk productService = LayananProduk.getInstance();
        InProduk[] products = productService.getProduk();
        System.out.println("Product List:");
        for (InProduk product : products) {
            System.out.println(product);
        }

        while (true) {
            System.out.println("Enter product id to add it to the cart or 'menu' if you want to navigate back to the main menu");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("menu")) {
                break;
            }
            if (input.equalsIgnoreCase("checkout")) {
                handleCheckout();
                break;
            }
            try {
                int productId = Integer.parseInt(input);
                InProduk product = productService.getProductById(productId);
                if (product != null) {
                    context.getSessionCart().addProduct(product);
                    System.out.println("Product " + product.getProductName() + " has been added to your cart. " +
                            "If you want to add a new product - enter the product id. " +
                            "If you want to proceed with checkout enter word 'checkout' to console");
                } else {
                    System.out.println("Please, enter product ID if you want to add product to cart. " +
                            "Or enter 'checkout' if you want to proceed with checkout. " +
                            "Or enter 'menu' if you want to navigate back to the main menu.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please, enter product ID if you want to add product to cart. " +
                        "Or enter 'checkout' if you want to proceed with checkout. " +
                        "Or enter 'menu' if you want to navigate back to the main menu.");
            }
        }
    }

    private void handleCheckout() {
        if (context.getLoggedInUser() == null) {
            System.out.println("You are not logged in. Please, sign in or create new account");
            return;
        }
        if (context.getSessionCart().isEmpty()) {
            System.out.println("Your cart is empty. Please, add product to cart first and then proceed with checkout");
            handleProductCatalog();
            return;
        }

        System.out.println("Enter your credit card number without spaces and press enter if you confirm purchase");
        String creditCard = scanner.nextLine();
        InPesanan order = new Pesanan();
        if (order.isCreditCardNumberValid(creditCard)) {
            order.setCreditCardNumber(creditCard);
            order.setCustomerId(context.getLoggedInUser().getId());
            order.setProducts(context.getSessionCart().getProducts());
            LayananPesanan.getInstance().addOrder(order);
            System.out.println("Thanks a lot for your purchase. Details about order delivery are sent to your email.");
            context.getSessionCart().clear();
        } else {
            System.out.println("You entered invalid credit card number. Valid credit card should contain 16 digits. Please, try one more time.");
            handleCheckout();
        }
    }

    private void handleMyOrders() {
        if (context.getLoggedInUser() == null) {
            System.out.println("Please, log in or create new account to see list of your orders");
            return;
        }

        InPesanan[] orders = LayananPesanan.getInstance().getOrdersByUserId(context.getLoggedInUser().getId());
        if (orders.length == 0) {
            System.out.println("Unfortunately, you don't have any orders yet. Navigate back to main menu to place a new order");
        } else {
            System.out.println("Your Orders:");
            for (InPesanan order : orders) {
                System.out.println("Order for user " + order.getCustomerId() + ": " +
                        java.util.Arrays.toString(((Pesanan) order).getProducts()));
            }
        }
    }

    private void handleSettings() {
        if (context.getLoggedInUser() == null) {
            System.out.println("Please, log in or create new account to change your account settings");
            return;
        }

        while (true) {
            System.out.println("Settings Menu:");
            System.out.println("1. Change Password");
            System.out.println("2. Change Email");
            System.out.println("Enter 'menu' to go back to main menu");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("menu")) {
                break;
            }
            try {
                int option = Integer.parseInt(input);
                switch (option) {
                    case 1:
                        System.out.println("Enter new password:");
                        String newPassword = scanner.nextLine();
                        context.getLoggedInUser().setPassword(newPassword);
                        System.out.println("Your password has been successfully changed");
                        break;
                    case 2:
                        System.out.println("Enter new email:");
                        String newEmail = scanner.nextLine();
                        context.getLoggedInUser().setEmail(newEmail);
                        System.out.println("Your email has been successfully changed");
                        break;
                    default:
                        System.out.println("Only 1, 2 is allowed. Try one more time");
                }
            } catch (NumberFormatException e) {
                System.out.println("Only 1, 2 is allowed. Try one more time");
            }
        }
    }

    private void handleCustomerList() {
        InPengguna[] users = LayananPengguna.getInstance().getPengguna();
        System.out.println("Customer List:");
        for (InPengguna user : users) {
            System.out.println(user);
        }
    }
}
