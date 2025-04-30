/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal1;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
class WarungMakan extends Transaksi implements Pembayaran {
    private ArrayList<String> pesanan = new ArrayList<>();
    private ArrayList<Double> hargaPesanan = new ArrayList<>();

    public void pesan(Makanan makanan, int jumlah) {
        double subtotal = makanan.hitungHarga(jumlah);
        totalHarga += subtotal;
        pesanan.add(makanan.getNama() + " x" + jumlah);
        hargaPesanan.add(subtotal);
        }

    @Override
    public void prosesPembayaran(double totalHarga) {
        System.out.println("Pembayaran sebesar Rp" + totalHarga + " telah diproses.");
    }

    @Override
    public void cetakStruk() {
        System.out.println("\n=== STRUK PEMBELIAN ===");
        for (int i = 0; i < pesanan.size(); i++) {
            System.out.printf("%-20s : Rp%.2f\n", pesanan.get(i), hargaPesanan.get(i));
        }
        System.out.println("-------------------------------");
        System.out.printf("Total Harga         : Rp%.2f\n", totalHarga);
        prosesPembayaran(totalHarga);
        System.out.println("===============================");
    }
}
