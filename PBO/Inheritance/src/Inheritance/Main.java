/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Legion 5 Pro
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Buku dan menginputkan item buku
        Buku buku1 = new Buku("B001", "The Bookshop", 2025, "Penelope Fitzgerald", 192, "Novel");
        Buku buku2 = new Buku("B002", "Atomic Habits", 2020, "James Clear", 320, "Self Improvement");
        Buku buku3 = new Buku("B003", "12 Cerita Glen Anggara", 2019, "Luluk HF", 360, "Fiksi");
        
        // Membuat objek DVD dan menginputkan item DVD
        DVD dvd1 = new DVD("D001", "13 Going on 30", 2004, 98, "Gary Winick", "PG-13");
        DVD dvd2 = new DVD("D002", "Men in Black II", 2002, 88, "Barry Sonnenfeld", "PG-13");
        
        // Menampilkan informasi sebelum perubahan
        System.out.println("- Item : ");
        buku1.displayInfo();
        System.out.println("\n");
        buku2.displayInfo();
        System.out.println("\n");
        buku3.displayInfo();
        System.out.println("\n");
        dvd1.displayInfo();
        System.out.println("\n");
        dvd2.displayInfo();
        System.out.println("\n");

        // Mengubah atribut menggunakan setter
        buku1.setGenre("Fiksi Politik");
        dvd1.setDurasi(100);
        buku3.setGenre("Romansa");

        // Menampilkan informasi setelah perubahan
        System.out.println("\n- Setelah perubahan:");
        buku1.displayInfo();
        System.out.println("\n");
        dvd1.displayInfo();
        System.out.println("\n");
        buku3.displayInfo();
        System.out.println("\n");

        // Meminjam dan mengembalikan item serta menampilkan info item setelah dilakukan peminjaman dan pengembalian
        System.out.println("- Peminjaman : ");
        buku1.pinjam();
        buku1.displayInfo();
        System.out.println("\n");
        dvd1.pinjam();
        dvd1.displayInfo();
        System.out.println("\n");
        System.out.println("- Pengembalian : ");
        buku1.kembalikan();
        buku1.displayInfo();
        System.out.println("\n");

        // Menjalankan method khusus
        System.out.println("- Method khusus : ");
        buku2.bacaRingkasan();
        System.out.println("\n");
        dvd2.putar();
        System.out.println("\n");
        
        // Menampilkan item melalui Polymorphism
        Item[] koleksi = {buku1, buku2, buku3, dvd1, dvd2};
        System.out.println("- Menampilkan semua item melalui polymorphism:");
        for (Item item : koleksi) {
            item.displayInfo();
            System.out.println("\n");
        }
    }
}

