/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Legion 5 Pro
 */
public class Buku extends Item {
    private String penulis;
    private int jumlahHalaman;
    private String genre;

    //Pembuatan constructor dengan menyertakan atribut super class Item
    public Buku(String id, String judul, int tahunTerbit, String penulis, int jumlahHalaman, String genre) {
        super(id, judul, tahunTerbit);
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
        this.genre = genre;
    }

    //Override method displayInfo() dari class Item
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Penulis: " + penulis + ", Halaman: " + jumlahHalaman + ", Genre: " + genre);
    }

    //Method khusus bacaRingkasan()
    public void bacaRingkasan() {
        System.out.println("Membaca ringkasan buku " + getJudul() + " oleh " + penulis);
    }

    // Getter dan Setter
    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

