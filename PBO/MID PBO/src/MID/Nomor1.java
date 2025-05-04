package MID;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Legion 5 Pro
 */
import java.util.*;

public class Nomor1 { //Konversi Dollar
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double KONVERSI = 13855.0;

        System.out.print("Masukkan jumlah uang dalam USD: ");
        double dollar = input.nextDouble();
        double rupiah = dollar * KONVERSI;

        System.out.printf("$%.2f = Rp. %.3f\n", dollar, rupiah);
    }
}

