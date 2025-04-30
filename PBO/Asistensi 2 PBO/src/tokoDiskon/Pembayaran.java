/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tokoDiskon;

/**
 *
 * @author Legion 5 Pro
 */
public class Pembayaran {
    private double harga;
    private double diskon;

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    // Inner class untuk menghitung diskon
    public class Diskon {
        public double hitungDiskon() {
            if (diskon < 0 || harga < 0) {
                throw new NumberFormatException("Harga dan diskon tidak boleh negatif");
            }
            if (diskon > 100) {
                throw new IllegalArgumentException("Diskon tidak boleh lebih dari 100%");
            }
            return harga - (harga * diskon / 100);
        }
    }
}
