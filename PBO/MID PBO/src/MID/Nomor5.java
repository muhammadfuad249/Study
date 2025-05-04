/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MID;

/**
 *
 * @author Legion 5 Pro
 */
public class Nomor5 { //Tabel Akar Kuadrat
    public static void main(String[] args) {
        System.out.println("Angka\tAkar Kuadrat");
        for (int i = 0; i <= 20; i += 2) {
            System.out.printf("%d\t%.4f\n", i, Math.sqrt(i));
        }
    }
}

