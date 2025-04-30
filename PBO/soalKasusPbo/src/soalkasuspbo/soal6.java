/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalkasuspbo;

/**
 *
 * @author Legion 5 Pro
 */
import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah suku
        System.out.print("Masukkan jumlah suku deret: ");
        int n = scanner.nextInt();

        // Variabel untuk menyimpan total jumlah deret
        double sum = 0.0;

        // Menghitung jumlah deret
        for (int i = 1; i <= n; i++) {
            double term = Math.pow(2, i - 1) / Math.pow(2, i);
            sum += term;
        }

        // Menampilkan hasil
        System.out.printf("Jumlah deret hingga suku ke-%d = %.4f%n", n, sum);

        // Menutup scanner
        scanner.close();
    }
}