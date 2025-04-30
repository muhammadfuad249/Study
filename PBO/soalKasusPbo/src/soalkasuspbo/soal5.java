/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalkasuspbo;

/**
 *
 * @author Legion 5 Pro
 */
public class soal5 {
    public static void main(String[] args) {
        // Menampilkan header tabel
        System.out.printf("%-10s %-10s%n", "Angka", "AkarKuadrat");
        System.out.println("-----------------------");

        // Menghitung dan menampilkan angka dan akar kuadratnya
        for (int i = 0; i <= 20; i += 2) {
            double squareRoot = Math.sqrt(i);
            System.out.printf("%-10d %-10.4f%n", i, squareRoot);
        }
    }
}