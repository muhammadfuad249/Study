/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MID;

/**
 *
 * @author Legion 5 Pro
 */
public class Nomor4 { // Bilangan Prima
    public static void main(String[] args) {
        for (int i = 6; i <= 30; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrima(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

