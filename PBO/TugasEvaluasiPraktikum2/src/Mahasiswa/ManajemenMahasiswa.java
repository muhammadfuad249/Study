/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mahasiswa;

import java.util.ArrayList;

public class ManajemenMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public ManajemenMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
        System.out.println("Mahasiswa berhasil ditambahkan.");
    }

    public void hapusMahasiswa(String nim) {
        boolean dihapus = daftarMahasiswa.removeIf(mhs -> mhs.getNim().equals(nim));
        if (dihapus) {
            System.out.println("Mahasiswa dengan NIM " + nim + " berhasil dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }
    }

    public void tampilkanMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada mahasiswa yang terdaftar.");
        } else {
            int i = 1;
            for (Mahasiswa mhs : daftarMahasiswa) {
                System.out.println(i + ". " + mhs);
                i++;
            }
        }
    }
}

