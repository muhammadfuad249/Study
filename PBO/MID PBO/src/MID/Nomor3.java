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

public class Nomor3 { //ASCII to Char
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode ASCII (0-127): ");
        int kode = input.nextInt();
        char karakter = (char) kode;

        System.out.println("Karakter: " + karakter);
    }
}

