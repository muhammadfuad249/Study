/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warungMakan;

/**
 *
 * @author Legion 5 Pro
 */
// Class WarungMakan.java
import java.util.*;

public class Service extends Transaksi implements Pembayaran {
    private List<String> pesanan = new ArrayList<>();

    public void pesan(Menu menu, int jumlah) {
        double hargaPesanan = menu.hitungHarga(jumlah);
        totalHarga += hargaPesanan;
        pesanan.add(menu.getNama() + " - " + jumlah + " = Rp" + hargaPesanan);
    }

    @Override
    public void prosesPembayaran(double totalHarga) {
        System.out.println("\nTotal yang harus dibayar: Rp" + totalHarga);
        System.out.println("Pembayaran berhasil ! Total Harga : Rp" + totalHarga);
    }

    @Override
    public void cetakStruk() {
        System.out.println("\n=== Struk Transaksi ===");
        for (String p : pesanan) {
            System.out.println(p);
        }
        System.out.println("Total Harga: Rp" + totalHarga);
    }
}

