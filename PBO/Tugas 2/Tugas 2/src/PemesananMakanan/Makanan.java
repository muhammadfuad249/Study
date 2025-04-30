/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PemesananMakanan;

/**
 *
 * @author Legion 5 Pro
 */
public abstract class Makanan {
    protected String nama;
    protected double harga;

    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void tampil() {
        System.out.println("Makanan: " + nama + ", Harga: Rp. " + harga);
    }

    // Abstract method
    public abstract void persiapan();
}

