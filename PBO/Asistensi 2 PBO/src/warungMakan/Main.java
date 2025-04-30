/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warungMakan;

/**
 *
 * @author Legion 5 Pro
 */
// Class Main.java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service warung = new Service();

        Menu[] menu = {
            new Menu("Nasi Goreng", 15000),
            new Menu("Mie Goreng", 15000),
            new Menu("Mie Kuah", 13000), 
            new Menu("Sop Rawon", 16000), 
            new Menu("Soto Ayam", 13000), 
        };

        System.out.println("=== MENU WARUNG MAKAN ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        char lanjut;
        do {
            System.out.print("Pilih menu (");
            for (int i = 0; i < menu.length; i++) {
                System.out.print((i + 1));
                if (i < menu.length - 1) System.out.print("/");
            }
            System.out.print(") : ");
            int pilihan = sc.nextInt();
            System.out.print("Jumlah porsi: ");
            int jumlah = sc.nextInt();
            warung.pesan(menu[pilihan - 1], jumlah);

            System.out.print("Tambah pesanan? (y/n): ");
            lanjut = sc.next().charAt(0);
        } while (lanjut == 'y');

        warung.prosesPembayaran(warung.totalHarga);
        warung.cetakStruk();
    }
}

