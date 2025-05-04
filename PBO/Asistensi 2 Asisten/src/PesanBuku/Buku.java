/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PesanBuku;

/**
 *
 * @author Legion 5 Pro
 */
import java.math.*;
import java.util.*;

public class Buku {
    private int id;
    private String nama;
    private Penulis[] penulis;
    private Penerbit penerbit;
    private int tahunTerbit;
    private int jumlahHalaman;
    private BigDecimal harga;
    private Sampul sampul;

    public Buku() {}

    public Buku(int id, String nama, Penulis[] penulis, Penerbit penerbit, int tahunTerbit,
                int jumlahHalaman, BigDecimal harga, Sampul sampul) {
        this.id = id;
        this.nama = nama;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;
        this.sampul = sampul;
    }

    public void setId(int id) { 
        this.id = id; 
    }
    public int getId() { 
        return id; 
    }
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public String getNama() { 
        return nama; 
    }
    public void setPenulis(Penulis[] penulis) { 
        this.penulis = penulis; 
    }
    public Penulis[] getPenulis() { 
        return penulis; 
    }
    public void setPenerbit(Penerbit penerbit) { 
        this.penerbit = penerbit; 
    }
    public Penerbit getPenerbit() { 
        return penerbit; 
    }
    public void setTahunTerbit(int tahunTerbit) { 
        this.tahunTerbit = tahunTerbit; 
    }
    public int getTahunTerbit() { 
        return tahunTerbit; 
    }
    public void setJumlahHalaman(int jumlahHalaman) { 
        this.jumlahHalaman = jumlahHalaman; 
    }
    public int getJumlahHalaman() { 
        return jumlahHalaman; 
    }
    public void setHarga(BigDecimal harga) { 
        this.harga = harga; 
    }
    public BigDecimal getHarga() { 
        return harga; 
    }
    public void setSampul(Sampul sampul) {
        this.sampul = sampul; 
    }
    public Sampul getSampul() { 
        return sampul; 
    }

    @Override
    public String toString() {
        return "- Buku ({" + id + "}, Nama : " + nama + " , Penulis : " + Arrays.toString(penulis) +
               ", Penerbit : " + penerbit + ", Tahun Terbit : " + tahunTerbit +
               ", Jumlah Halaman : " + jumlahHalaman + ", Harga : " + harga +
               ", Sampul : " + sampul + ")";
    }
}
