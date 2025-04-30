/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Belajar1;

/**
 *
 * @author Legion 5 Pro
 */
import static Belajar1.Main.confirmRepeat;
import java.util.*;

public class Pesanan {
    public String username;
    public Item item;
    public int stok;

    public Pesanan(String username, Item item, int stok) {
        this.username = username;
        this.item = item;
        this.stok = stok;
    }

    public static void tambahOrder(Scanner sc, Pengguna pengguna) {
        do {
            Item.tampilData();
            System.out.print("Masukkan Indeks produk yang ingin dipesan : ");
            int indeks = Integer.parseInt(sc.nextLine());
            if (indeks < 0 || indeks >= Data.item.size()) {
                System.out.println("Produk tidak ditemukan.");
                Utils.pause();
                return;
            }
            Item item = Data.item.get(indeks);
            System.out.print("Jumlah: ");
            int jml = Integer.parseInt(sc.nextLine());
            if (jml > item.stok) {
                System.out.println("Produk tidak cukup.");
            } else {
                item.stok -= jml;
                Data.pesan.add(new Pesanan(pengguna.username, item, jml));
                System.out.println("Pembelian berhasil dilakukan.");
                confirmRepeat(sc);
            }
            Utils.pause();
        } while (main.input = "n");
    }

    public static void tampilPesanan(Pengguna pengguna) {
        System.out.println("--- Daftar Pesanan Anda ---");
        for (Pesanan pesan : Data.pesan) {
            if (pesan.username.equals(pengguna.username)) {
                for (int i = 1; i < Data.pesan.size(); i++) {
                    Item item = Data.item.get(i);
                    System.out.printf("Produk ke-" + i + "Nama : " + pesan.item.namaProduk + "Harga : " + pesan.item.harga + "Dipesan : " + pesan.stok);
                }
            }
            Utils.pause();
        }
    }

    public static void tampilData() {
        System.out.println("--- Semua Pesanan ---");
        for (Pesanan pesan : Data.pesan) {
            System.out.printf("%s memesan %s x%d\n", pesan.username, pesan.item.namaProduk, pesan.stok);
        }
        Utils.pause();
    }
}

