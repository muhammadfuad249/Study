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

public class UserService {
    private ArrayList<User> users = new ArrayList<>();

    public void signUp(Scanner scanner) {
        Utils.clearScreen();
        System.out.println("=== SIGN UP ===");
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
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("Username: ");
        String username = scanner.nextLine();

        if (getUserByUsername(username) != null) {
            System.out.println("Username sudah digunakan!");
            Utils.pause(scanner);
            return;
        }

        System.out.print("Password: ");
        String password = scanner.nextLine();

        users.add(new User(name, username, password, role));
        System.out.println("Pendaftaran berhasil!");
        Utils.pause(scanner);
    }

    public User signIn(Scanner scanner) {
        Utils.clearScreen();
        System.out.println("=== SIGN IN ===");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        User user = getUserByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            System.out.println("Username atau password salah!");
            Utils.pause(scanner);
            return null;
        }

        System.out.println("Login berhasil! Selamat datang, " + user.getName());
        Utils.pause(scanner);
        return user;
    }

    private User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) return user;
        }
        return null;
    }
}

