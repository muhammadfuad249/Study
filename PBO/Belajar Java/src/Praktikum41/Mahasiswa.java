/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum41;

/**
 *
 * @author ALDI
 */
public class Mahasiswa {
    // Atribut dengan akses modifier private (enkapsulasi)
    private String nama;
    private int umur;

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk umur
    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid!");
        }
    }

    // Getter untuk umur
    public int getUmur() {
        return umur;
    }
}

