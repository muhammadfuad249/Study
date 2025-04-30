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

public class Item {
    public String namaProduk;
    public int harga;
    public int stok;

    public Item(String namaProduk, int harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public static void tampilData() {
        System.out.println("--- Daftar Produk ---");
        for (int i = 1; i < Data.item.size(); i++) {
            Item item = Data.item.get(i);
            System.out.printf("Produk ke-" + i + ", Nama : " + item.namaProduk + ", Harga : " +  item.harga + ", Stok : " +  item.stok);
        }
        Utils.pause();
    }

    public static void tambahData(Scanner sc) {
        do {
            System.out.print("Nama : ");
            String namaProduk = sc.nextLine();
            System.out.print("Harga: ");
            int harga = Integer.parseInt(sc.nextLine());
            System.out.print("Stok: ");
            int stok = Integer.parseInt(sc.nextLine());
            Data.item.add(new Item(namaProduk, harga, stok));
    //        System.out.println("Produk berhasil ditambahkan.");
            confirmRepeat(sc);
            Utils.pause();
        } while (sc != null);
    }

    public static void updateData(Scanner sc) {
        do {
            System.out.println("Data Produk Sebelum Perubahan");
            System.out.println("=============================\n");
            tampilData();
            System.out.print("Masukkan Indeks produk yang ingin di-update: ");
            int indeks = Integer.parseInt(sc.nextLine());
            if (indeks >= 0 && indeks < Data.item.size()) {
                Item item = Data.item.get(indeks);
                System.out.print("Harga : ");
                item.harga = Integer.parseInt(sc.nextLine());
                System.out.print("Stok: ");
                item.stok += Integer.parseInt(sc.nextLine());
                System.out.println("Produk berhasil diperbarui.");
                confirmRepeat(sc);
            } else {
                System.out.println("Produk tidak ditemukan.");
            }
            Utils.pause();
        } while (sc != null);
    }

    public static void hapusData(Scanner sc) {
        do {
            tampilData();
            System.out.print("Masukkan Indeks produk yang ingin di-hapus: ");
            int indeks = Integer.parseInt(sc.nextLine());
            if (indeks >= 0 && indeks < Data.item.size()) {
                Data.item.remove(indeks);
                System.out.println("Produk berhasil dihapus.");
                confirmRepeat(sc);
            } else {
                System.out.println("Produk tidak ditemukan.");
            }
            Utils.pause();
        } while (sc != null);
    }
}

