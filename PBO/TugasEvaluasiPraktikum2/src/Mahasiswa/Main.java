/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mahasiswa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();

        int pilihan;
        do {
            System.out.println("\n=== Menu Manajemen Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Tampilkan Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Nilai Rata-rata: ");
                    Double nilai = input.nextDouble();
                    input.nextLine(); // Membersihkan newline
                    Mahasiswa mhs = new Mahasiswa(nama, nim, nilai);
                    manajemen.tambahMahasiswa(mhs);
                    break;
                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang ingin dihapus: ");
                    String nimHapus = input.nextLine();
                    manajemen.hapusMahasiswa(nimHapus);
                    break;
                case 3:
                    manajemen.tampilkanMahasiswa();
                    break;
                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        input.close();
    }
}

