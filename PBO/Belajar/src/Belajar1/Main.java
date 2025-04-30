/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Belajar1;

/**
 *
 * @author Legion 5 Pro
 */
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Pengguna currentUser = null;

    public static void main(String[] args) {
        while (true) {
            Utils.clearScreen();
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Product Catalog");
            System.out.println("4. Exit");
            System.out.print("Pilih menu: ");
            String pilih = scanner.nextLine();

            switch (pilih) {
                case "1": signUp(); break;
                case "2": signIn(); break;
                case "3": Item.tampilData(); break;
                case "4": System.exit(0);
                default: System.out.println("Pilihan tidak valid"); 
                Utils.pause();
            }
        }
    }

    static void signUp() {
        Utils.clearScreen();
        boolean role = false;
        while (true) {
            System.out.println("Pilih jenis akun:");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.print("Pilihan: ");
            String roleChoice = scanner.nextLine();
            if (roleChoice.equals("1")) {
                role = true;
                break;
            } else if (roleChoice.equals("2")) {
                role = false;
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
        System.out.println("=== SIGN UP ===");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("Username: ");
        String username = scanner.nextLine();
        if (Data.getByUsername(username) != null) {
            System.out.println("Username sudah digunakan.");
            Utils.pause();
            return;
        }
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Data.pengguna.add(new Pengguna(name, username, password, role));
        System.out.println("Akun berhasil dibuat!");
        Utils.pause();
    }

    static void signIn() {
        Utils.clearScreen();
        System.out.println("=== SIGN IN ===");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        Pengguna pengguna = Data.getByUsername(username);

        if (pengguna != null && pengguna.password.equals(password)) {
            currentUser = pengguna;
            signedInMenu();
        } else {
            System.out.println("Login gagal!");
            Utils.pause();
        }
    }

    static void signedInMenu() {
        while (true) {
            Utils.clearScreen();
            System.out.println("=== MENU SESUDAH LOGIN ===");
            System.out.println("1. Sign Out");
            System.out.println("2. Product Catalog");
            System.out.println("3. Product Management");
            System.out.print("Pilih menu: ");
            String pilih = scanner.nextLine();

            switch (pilih) {
                case "1": break;
                case "2": catalogMenu(); break;
                case "3": managementMenu();
                default: System.out.println("Pilihan tidak valid"); Utils.pause();
            }
        }
    }

    static void catalogMenu() {
        while (true) {
            Utils.clearScreen();
            System.out.println("=== PRODUCT CATALOG ===");
            if (currentUser.role) {
                System.out.println("1. Show Product");
                System.out.println("2. Add Product");
                System.out.println("3. Update Product");
                System.out.println("4. Delete Product");
                System.out.println("5. Kembali");
                System.out.print("Pilih: ");
                String pilih = scanner.nextLine();

                switch (pilih) {
                    case "1": Item.tampilData(); break;
                    case "2": Item.tambahData(scanner); break;
                    case "3": Item.updateData(scanner); break;
                    case "4": Item.hapusData(scanner); break;
                    case "5": return;
                    default: System.out.println("Pilihan tidak valid"); Utils.pause();
                }
            } else {
                System.out.println("1. Show Product");
                System.out.println("2. Kembali");
                System.out.print("Pilih: ");
                String pilih = scanner.nextLine();

                switch (pilih) {
                    case "1": Item.tambahData(scanner); break;
                    case "2": return;
                    default: System.out.println("Pilihan tidak valid"); Utils.pause();
                }
            }
        }
    }

    static void managementMenu() {
        while (true) {
            Utils.clearScreen();
            System.out.println("=== PRODUCT MANAGEMENT ===");
            if (currentUser.role) {
                System.out.println("1. Daftar Pesanan");
                System.out.println("2. Kembali");
                System.out.print("Pilih: ");
                String pilih = scanner.nextLine();
                switch (pilih) {
                    case "1": Pesanan.tampilData(); break;
                    case "2": return;
                    default: System.out.println("Pilihan tidak valid"); Utils.pause();
                }
            } else {
                System.out.println("1. Tambah Pesanan");
                System.out.println("2. Daftar Pesanan");
                System.out.println("3. Kembali");
                System.out.print("Pilih: ");
                String pilih = scanner.nextLine();
                switch (pilih) {
                    case "1": Pesanan.tambahOrder(scanner, currentUser); break;
                    case "2": Pesanan.tampilPesanan(currentUser); break;
                    case "3": return;
                    default: System.out.println("Pilihan tidak valid"); Utils.pause();
                }
            }
        }
    }
    
    static boolean confirmRepeat(Scanner sc) {
        System.out.print("Ingin melakukan aktivitas ini lagi? (y/n): ");
        String input = sc.nextLine();
        return input.equalsIgnoreCase("y");
    }
}

