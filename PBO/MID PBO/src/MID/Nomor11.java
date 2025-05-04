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

public class Nomor11 { //Deret Bilangan
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas akhir pembilang (ganjil, maksimal 97): ");
        int batas = input.nextInt();

        if (batas % 2 == 0 || batas < 1 || batas > 97) {
            System.out.println("Masukkan harus bilangan ganjil antara 1 dan 97.");
            return;
        }

        double sum = 0.0;

        System.out.println("\nPerhitungan deret:");
        for (int pembilang = 1; pembilang <= batas; pembilang += 2) {
            int penyebut = pembilang + 2;
            double nilai = (double) pembilang / penyebut;
            sum += nilai;
            System.out.printf("%d/%d = %.4f\n", pembilang, penyebut, nilai);
        }

        System.out.printf("\nHasil penjumlahan deret hingga %d/%d adalah: %.4f\n",
                          batas, batas + 2, sum);
    }
}

