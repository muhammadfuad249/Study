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

public class soal3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode ASCII (0-127): ");
        int kodeAscii = scanner.nextInt();

        if (kodeAscii >= 0 && kodeAscii <= 127) {
            char karakter = (char) kodeAscii;
            System.out.println("Karakter: " + karakter);
        } else {
            System.out.println("Kode ASCII harus antara 0 dan 127.");
        }

        scanner.close();
    }
}