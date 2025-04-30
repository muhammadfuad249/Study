/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mahasiswa;

public class Mahasiswa {
    private String nama;
    private String nim;
    private Double nilaiRatarata;

    public Mahasiswa(String nama, String nim, Double nilaiRatarata) {
        this.nama = nama;
        this.nim = nim;
        this.nilaiRatarata = nilaiRatarata;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public Double getNilaiRatarata() {
        return nilaiRatarata;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NIM: " + nim + ", Nilai Rata-rata: " + nilaiRatarata;
    }
}

