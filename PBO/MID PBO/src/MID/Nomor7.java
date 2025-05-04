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

public class Nomor7 { //Jumlah Bilangan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            sum += input.nextInt();
        }

        System.out.println("Hasil Penjumlahan: " + sum);
    }
}

