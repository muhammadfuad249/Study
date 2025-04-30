/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warungMakan;

/**
 *
 * @author Legion 5 Pro
 */
public class Menu {
    private String nama;
    private double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }

    @Override
    public String toString() {
        return nama + " - Rp" + harga;
    }
}
