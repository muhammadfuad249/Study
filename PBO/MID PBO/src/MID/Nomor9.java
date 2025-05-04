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

public class Nomor9 { //Kaki ke Meter
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang dalam kaki: ");
        double kaki = input.nextDouble();
        double meter = kaki * 0.305;

        System.out.printf("%.2f kaki = %.3f meter\n", kaki, meter);
    }
}

