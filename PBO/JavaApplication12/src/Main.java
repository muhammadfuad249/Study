/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Legion 5 Pro
 */
// Kelas dasar
abstract class Bentuk {
    abstract void gambar(); // Metode abstrak
}

// Kelas turunan Lingkaran
class Lingkaran extends Bentuk {
    @Override
    void gambar() {
        System.out.println("Menggambar Lingkaran");
    }
}

// Kelas turunan Persegi
class Persegi extends Bentuk {
    @Override
    void gambar() {
        System.out.println("Menggambar Persegi");
    }
}

// Kelas utama untuk menguji polymorphism
public class Main {
    public static void main(String[] args) {
        Bentuk bentuk1 = new Lingkaran(); // Polymorphism
        Bentuk bentuk2 = new Persegi();    // Polymorphism

        bentuk1.gambar(); // Output: Menggambar Lingkaran
        bentuk2.gambar(); // Output: Menggambar Persegi
    }
}
