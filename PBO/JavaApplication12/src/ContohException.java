/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Legion 5 Pro
 */
public class ContohException {
    public static void main(String[] args) {
        try {
            int hasil = 10 / 0; // Ini akan menghasilkan ArithmeticException
            System.out.println("Hasil: " + hasil); // Baris ini tidak akan dieksekusi
        } catch (ArithmeticException e) {
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        }
        System.out.println("Program tetap berjalan setelah penanganan exception.");
    }
}
