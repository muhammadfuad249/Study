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

public class ProductService {
    private ArrayList<Product> products = new ArrayList<>();

    public void showProducts() {
        Utils.clearScreen();
        System.out.println("=== DAFTAR PRODUK ===");
        if (products.isEmpty()) {
            System.out.println("Belum ada produk.");
        } else {
            for (int i = 0; i < products.size(); i++) {
                Product p = products.get(i);
                System.out.println("Produk ke-" + (i+1) + ", Nama : " + p.getName() + ", Harga : " + p.getPrice() + ", Jumlah : " + p.getStock());
            }
        }
    }

    public void handleCatalog(Scanner scanner, User user) {
        while (true) {
            Utils.clearScreen();
            System.out.println("=== PRODUCT CATALOG ===");
            if (user.getRole(true)) {
                System.out.println("\n1. Tambah Produk");
                System.out.println("2. Tampil Produk");
                System.out.println("3. Update Produk");
                System.out.println("4. Hapus Produk");
                System.out.println("5. Kembali");
                System.out.print("Pilih: ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        addProduct(scanner);
                        break;
                    case "2": 
                        showProducts();
                        break;
                    case "3":
                        updateProduct(scanner);
                        break;
                    case "4":
                        deleteProduct(scanner);
                        break;
                    case "5":
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        Utils.pause(scanner);
                }
            } else {
                System.out.println("\n1. Tampil Produk");
                System.out.println("2. Keluar");
                System.out.print("Pilih: ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        showProducts();
                        break;
                    case "2": 
                        return;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        Utils.pause(scanner);
                }
            }
        }
    }

    private void addProduct(Scanner scanner) {
        System.out.print("Nama produk: ");
        String name = scanner.nextLine();
        System.out.print("Harga: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Stok: ");
        int stock = Integer.parseInt(scanner.nextLine());
        products.add(new Product(name, price, stock));
        System.out.println("Produk ditambahkan!");
        Utils.pause(scanner);
    }

    private void updateProduct(Scanner scanner) {
        showProducts();
        System.out.print("Pilih indeks produk: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index >= 0 && index < products.size()) {
            System.out.print("Harga baru: ");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.print("Tambah stok: ");
            int stock = Integer.parseInt(scanner.nextLine());
            Product p = products.get(index);
            p.setPrice(price);
            p.addStock(stock);
            System.out.println("Produk diperbarui.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
        Utils.pause(scanner);
    }

    private void deleteProduct(Scanner scanner) {
        showProducts();
        System.out.print("Pilih indeks produk: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index >= 0 && index < products.size()) {
            products.remove(index);
            System.out.println("Produk dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
        Utils.pause(scanner);
    }

    public Product getProductByIndex(int index) {
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        }
        return null;
    }
}
