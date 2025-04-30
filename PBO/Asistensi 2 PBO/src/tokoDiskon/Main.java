/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tokoDiskon;

/**
 *
 * @author Legion 5 Pro
 */
import java.util.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pembayaran pembayaran = new Pembayaran();

        try {
            System.out.println("=== Program Hitung Diskon ===");
            System.out.print("Masukkan harga barang: ");
            double harga = scanner.nextDouble();
            pembayaran.setHarga(harga);

            System.out.print("Masukkan diskon (%): ");
            double diskon = scanner.nextDouble();
            pembayaran.setDiskon(diskon);

            Pembayaran.Diskon d = pembayaran.new Diskon();
            double total = d.hitungDiskon();

            System.out.println("Harga setelah diskon: Rp" + total);
        } catch (NumberFormatException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
