/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MID;

/**
 *
 * @author Legion 5 Pro
 */
import java.util.*;

public class Nomor8 { //Jumlah Karakter Angka
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah karakter: ");
        int n = input.nextInt();
        int sum = 0;

        System.out.println("Masukkan " + n + " karakter:");
        for (int i = 0; i < n; i++) {
            char kar = input.next().charAt(0);
            if (Character.isDigit(kar)) {
                sum += Integer.parseInt(String.valueOf(kar));
            }
        }

        System.out.println("Hasil Penjumlahan Karakter Angka: " + sum);
    }
}

