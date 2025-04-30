/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PemesananMakanan;

/**
 *
 * @author Legion 5 Pro
 */
public class FastFood extends Makanan implements Pesanan {

    public FastFood(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public void persiapan() {
        System.out.println("Menyiapkan fast food: " + nama);
    }

    @Override
    public void pesan() {
        System.out.println("Pengantaran fast food: " + nama + " diantarkan dalam waktu 15 menit.");
    }
}

