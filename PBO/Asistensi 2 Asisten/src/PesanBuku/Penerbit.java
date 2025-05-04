/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PesanBuku;

/**
 *
 * @author Legion 5 Pro
 */
public class Penerbit {
    private int id;
    private String namaPenerbit;

//    public Publisher() {}

    public Penerbit(int id, String namaPenerbit) {
        this.id = id;
        this.namaPenerbit = namaPenerbit;
    }

    public void setId(int id) { 
        this.id = id; 
    }
    public int getId() { 
        return id; 
    }
    public void setNamaPenerbit(String namaPenerbit) { 
        this.namaPenerbit = namaPenerbit; 
    }
    public String getNamaPenerbit() { 
        return namaPenerbit; 
    }

    @Override
    public String toString() {
        return "{" + id + "}, " + namaPenerbit;
    }
}
