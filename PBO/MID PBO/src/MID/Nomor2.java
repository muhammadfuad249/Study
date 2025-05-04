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

public class Nomor2 { //Jumlah Digit
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();
        int jumlah = 0;

        while (angka > 0) {
            jumlah += angka % 10;
            angka /= 10;
        }

        System.out.println("Jumlah digit = " + jumlah);
    }
}

