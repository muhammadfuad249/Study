/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MID;

/**
 *
 * @author Legion 5 Pro
 */
public class Nomor6 { //Deret Pecahan
     public static void main(String[] args) {
        double sum = 0.0;

        for (int pembilang = 1; pembilang <= 98; pembilang += 2) {
            int penyebut = pembilang + 1;
            double nilai = (double) pembilang / penyebut;
            sum += nilai;
            System.out.printf("%d/%d = %.4f\n", pembilang, penyebut, nilai);
        }

        System.out.printf("\nHasil penjumlahan deret: %.4f\n", sum);
    }
}
