/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP1;

/**
 *
 * @author ALDI
 */

// Interface
interface Mesin {
    void nyalakan();
    void matikan();
}

// Abstract class
abstract class Kendaraan {
    String nama;

    Kendaraan(String nama) {
        this.nama = nama;
    }

    void jalan() {
        System.out.println(nama + " sedang berjalan...");
    }

    // Abstract method
    abstract void info();
}

// Class Mobil mewarisi Kendaraan dan mengimplementasikan Mesin
class Mobil extends Kendaraan implements Mesin {
    Mobil(String nama) {
        super(nama);
    }

    @Override
    public void nyalakan() {
        System.out.println(nama + " dinyalakan.");
    }

    @Override
    public void matikan() {
        System.out.println(nama + " dimatikan.");
    }

    @Override
    void info() {
        System.out.println("Ini adalah mobil bernama " + nama);
    }
}

public class Modul54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobil m = new Mobil("BMW");

        m.nyalakan();
        m.jalan();
        m.info();
        m.matikan();
    }
    
}
