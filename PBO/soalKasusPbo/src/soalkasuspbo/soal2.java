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

public class soal2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan integer antara 0 dan 1000: ");
            int number = scanner.nextInt();
            
            if (number >= 0 && number <= 1000) {
                int sum = 0;
                
                // Ekstrak dan jumlahkan digit menggunakan modulus dan pembagian
                int tempNumber = number;
                while (tempNumber != 0) {
                    int digit = tempNumber % 10; // Ambil digit terakhir
                    sum += digit;              // Tambahkan ke jumlah
                    tempNumber /= 10;         // Hapus digit terakhir
                }
                
                System.out.println("Penjumlahan digit: " + sum);
            } else {
                System.out.println("Input tidak valid. Masukkan angka antara 0 dan 1000.");
            }
        }
    }
}