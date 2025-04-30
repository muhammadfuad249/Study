/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Legion 5 Pro
 */
public class DVD extends Item {
    private int durasi;
    private String sutradara;
    private String rating;

    //Pembuatan constructor dengan menyertakan atribut super class Item
    public DVD(String id, String judul, int tahunTerbit, int durasi, String sutradara, String rating) {
        super(id, judul, tahunTerbit);
        this.durasi = durasi;
        this.sutradara = sutradara;
        this.rating = rating;
    }

    //Override method displayInfo() dari class Item
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Durasi: " + durasi + " menit, Sutradara: " + sutradara + ", Rating: " + rating);
    }

    //Method khusus putar()
    public void putar() {
        System.out.println("Memutar DVD " + getJudul() + " dengan durasi " + durasi + " menit");
    }

    // Getter dan Setter
    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
