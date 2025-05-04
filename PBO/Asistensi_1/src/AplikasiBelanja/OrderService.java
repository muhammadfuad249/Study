/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiBelanja;

/**
 *
 * @author Legion 5 Pro
 */
import java.util.ArrayList;
import java.util.Scanner;

public class OrderService {
    private ArrayList<Order> orders = new ArrayList<>();

    public void handleOrders(Scanner scanner, User user, ProductService productService) {
        while (true) {
            Utils.clearScreen();
            System.out.println("=== PRODUCT MANAGEMENT ===");
            if (user.getRole(true)) {
                showAllOrders();
                Utils.pause(scanner);
                return;
            } else {
                System.out.println("1. Tambah Pesanan");
                System.out.println("2. Daftar Pesanan");
                System.out.println("3. Kembali");
                System.out.print("Pilih: ");
                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        placeOrder(scanner, user, productService);
                        break;
                    case "2":
                        showUserOrders(user);
                        Utils.pause(scanner);
                        break;
                    case "3":
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        Utils.pause(scanner);
                }
            }
        }
    }

    private void placeOrder(Scanner scanner, User user, ProductService productService) {
        productService.showProducts();
        System.out.print("Pilih indeks produk: ");
        int index = Integer.parseInt(scanner.nextLine());
        Product p = productService.getProductByIndex(index);
        if (p == null) {
            System.out.println("Produk tidak ditemukan.");
            Utils.pause(scanner);
            return;
        }

        System.out.print("Jumlah: ");
        int qty = Integer.parseInt(scanner.nextLine());
        if (qty <= p.getStock()) {
            p.reduceStock(qty);
            orders.add(new Order(user, p, qty));
            System.out.println("Pesanan berhasil!");
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
        Utils.pause(scanner);
    }

    private void showUserOrders(User user) {
        System.out.println("=== DAFTAR PESANAN ANDA ===");
        for (Order order : orders) {
            if (order.getUser().getUsername().equals(user.getUsername())) {
                for (int i = 0; i < orders.size(); i++) {
                    Product p = order.getProduct(i+1);
                    System.out.println("Produk ke-" + (i+1) + ", Nama : " + p.getName() + ", Harga : " + p.getPrice() + ", Jumlah : " + order.getQuantity());
                }
            }
        }
    }

    private void showAllOrders() {
        System.out.println("=== SEMUA PESANAN ===");
        for (Order order : orders) {
            int i = 0;
            Product p = order.getProduct(i);
            User u = order.getUser();
            System.out.printf("%s memesan %d x %s\n", u.getUsername(), order.getQuantity(), p.getName());
        }
    }
}
