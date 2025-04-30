/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PemesananMakanan;

/**
 *
 * @author Legion 5 Pro
 */
public class HealthyFood extends Makanan implements Pesanan {

    public HealthyFood(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public void persiapan() {
        System.out.println("Menyiapkan healthy food: " + nama);
    }

    @Override
    public void pesan() {
        System.out.println("Pengantaran healthy food: " + nama + " diantarkan dalam waktu 30 menit.");
    }
}

