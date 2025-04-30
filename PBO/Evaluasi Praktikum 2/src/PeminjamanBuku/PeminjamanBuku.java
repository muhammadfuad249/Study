/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PeminjamanBuku;

/**
 *
 * @author Legion 5 Pro
 */
import java.util.*;

class Buku {
    String judul;
    String penulis;
    boolean tersedia;
    String peminjam;
    String tanggalPeminjaman;
    String tanggalPengembalian;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.tersedia = true;
    }
}

class Perpustakaan {
    List<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(String judul, String penulis) {
        daftarBuku.add(new Buku(judul, penulis));
        System.out.println("Buku berhasil ditambahkan.");
    }

    public void lihatBuku() {
        if (daftarBuku.isEmpty()) {
            System.out.println("Tidak ada buku dalam perpustakaan.");
            return;
        }
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku) {
            System.out.println("Judul: " + buku.judul + ", Penulis: " + buku.penulis + ", Tersedia: " + (buku.tersedia ? "Ya" : "Tidak"));
        }
    }

    public void pinjamBuku(String judul, String namaPeminjam, String tanggal) {
        for (Buku buku : daftarBuku) {
            if (buku.judul.equalsIgnoreCase(judul) && buku.tersedia) {
                buku.tersedia = false;
                buku.peminjam = namaPeminjam;
                buku.tanggalPeminjaman = tanggal;
                System.out.println("Buku berhasil dipinjam.");
                return;
            }
        }
        System.out.println("Buku tidak tersedia atau tidak ditemukan.");
    }

    public void lihatPeminjaman() {
        boolean adaPeminjaman = false;
        for (Buku buku : daftarBuku) {
            if (!buku.tersedia) {
                adaPeminjaman = true;
                System.out.println("Judul: " + buku.judul + ", Peminjam: " + buku.peminjam + ", Tanggal Peminjaman: " + buku.tanggalPeminjaman);
            }
        }
        if (!adaPeminjaman) {
            System.out.println("Tidak ada buku yang sedang dipinjam.");
        }
    }

    public void kembalikanBuku(String judul, String tanggal) {
        for (Buku buku : daftarBuku) {
            if (buku.judul.equalsIgnoreCase(judul) && !buku.tersedia) {
                buku.tersedia = true;
                buku.tanggalPengembalian = tanggal;
                System.out.println("Buku berhasil dikembalikan.");
                return;
            }
        }
        System.out.println("Buku tidak ditemukan atau belum dipinjam.");
    }
}

public class PeminjamanBuku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        
        while (true) {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Lihat Peminjaman");
            System.out.println("5. Kembalikan Buku");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan nama penulis: ");
                    String penulis = scanner.nextLine();
                    perpustakaan.tambahBuku(judul, penulis);
                    break;
                case 2:
                    perpustakaan.lihatBuku();
                    break;
                case 3:
                    System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                    String judulPinjam = scanner.nextLine();
                    System.out.print("Masukkan nama peminjam: ");
                    String namaPeminjam = scanner.nextLine();
                    System.out.print("Masukkan tanggal peminjaman (dd/mm/yyyy): ");
                    String tanggalPinjam = scanner.nextLine();
                    perpustakaan.pinjamBuku(judulPinjam, namaPeminjam, tanggalPinjam);
                    break;
                case 4:
                    perpustakaan.lihatPeminjaman();
                    break;
                case 5:
                    System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
                    String judulKembali = scanner.nextLine();
                    System.out.print("Masukkan tanggal pengembalian (dd/mm/yyyy): ");
                    String tanggalKembali = scanner.nextLine();
                    perpustakaan.kembalikanBuku(judulKembali, tanggalKembali);
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}

