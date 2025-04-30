/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WarungMakan warung = new WarungMakan();

        Makanan[] daftarMenu = {
            new Makanan("Nasi Goreng", 15000),
            new Makanan("Mie Ayam", 12000),
            new Makanan("Sate Ayam", 20000)
        };

        System.out.println("=== MENU WARUNG MAKAN ===");
        for (int i = 0; i < daftarMenu.length; i++) {
            System.out.println((i+1) + ". " + daftarMenu[i].getNama() + " - Rp" + daftarMenu[i].getHarga());
        }

        char lanjut;
        do {
            System.out.print("Pilih menu (1/2/3): ");
    int pilihan = input.nextInt();

    System.out.print("Jumlah porsi: ");
    int jumlah = input.nextInt();

    warung.pesan(daftarMenu[pilihan - 1], jumlah);

    System.out.print("Tambah pesanan lagi? (y/n): ");
    lanjut = input.next().charAt(0);
        } while (lanjut == 'y' || lanjut == 'Y');
        warung.cetakStruk();
    }
}
