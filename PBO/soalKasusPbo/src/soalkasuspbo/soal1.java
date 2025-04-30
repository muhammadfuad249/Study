/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalkasuspbo;

/**
 *
 * @author Legion 5 Pro
 */
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        // Nilai konversi dari dollar ke rupiah
        final double CONVERSION_RATE = 13855.0;

        // Meminta pengguna untuk memasukkan jumlah uang dalam dollar
        try ( // Membuat scanner untuk membaca input dari pengguna
                Scanner scanner = new Scanner(System.in)) {
            // Meminta pengguna untuk memasukkan jumlah uang dalam dollar
            System.out.print("Masukkan jumlah uang dalam USD: $");
            double dollarAmount = scanner.nextDouble();
            // Menghitung jumlah uang dalam rupiah
            double rupiahAmount = dollarAmount * CONVERSION_RATE;
            // Menampilkan hasil konversi
            System.out.printf("$%.2f = Rp. %.2f%n", dollarAmount, rupiahAmount);
            // Menutup scanner
        }
    }
}