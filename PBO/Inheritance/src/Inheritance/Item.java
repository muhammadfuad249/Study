/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author Legion 5 Pro
 */
public class Item {
    //Pendefinisian variabel
    private String id;
    private String judul;
    private int tahunTerbit;
    private boolean statusTersedia;
    
    //Pembuatan constructor
    public Item(String id, String judul, int tahunTerbit) {
        this.id = id;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.statusTersedia = true;
    }
    
    //Method pinjam()
    public void pinjam() {
        if (statusTersedia) {
            statusTersedia = false;
            System.out.println("Item " + judul + " dipinjam");
        } else {
            System.out.println("Item " + judul + " tidak tersedia");
        }
    }

    //Method kembalikan()
    public void kembalikan() {
        statusTersedia = true;
        System.out.println("Item " + judul + " dikembalikan");
    }

    //Method menampilkan output (displayInfo())
    public void displayInfo() {
        System.out.println("ID: " + id + ", Judul: " + judul + ", Tahun: " + tahunTerbit + ", Tersedia: " + statusTersedia);
    }

    // Getter dan Setter untuk id, judul, dan tahunTerbit
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public boolean isStatusTersedia() {
        return statusTersedia;
    }

    public void setStatusTersedia(boolean statusTersedia) {
        this.statusTersedia = statusTersedia;
    }
}

