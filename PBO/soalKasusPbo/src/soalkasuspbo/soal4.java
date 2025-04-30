/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soalkasuspbo;

/**
 *
 * @author Legion 5 Pro
 */
public class soal4 {

    public static void main(String[] args) {
        System.out.println("Bilangan prima antara 6 dan 30:");

        for (int i = 6; i <= 30; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 bukan prima
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Jika n habis dibagi i, maka n bukan prima
            }
        }
        return true; // Jika tidak ada faktor selain 1 dan dirinya sendiri, maka n prima
    }
}