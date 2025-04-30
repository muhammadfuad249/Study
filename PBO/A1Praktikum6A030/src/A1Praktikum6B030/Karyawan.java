/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A1Praktikum6B030;

/**
 *
 * @author Legion 5 Pro
 */
public abstract class Karyawan {
    int id;
    String nama;
    int gaji;
    int bonus;
    
    public Karyawan (int id, String nama, int gaji, int bonus) {
        this.id = id;
        this.nama = nama;
        this.gaji = gaji;
        this.bonus = bonus;
    }
    
    public void totalGaji() {
        int totalGaji = this.gaji += this.bonus;
        System.out.println("Total Gaji : " + totalGaji);
    }
    
    public abstract void updateJabatan (String jabatan);
    public abstract void updateGaji (int gaji);
    public abstract void updateBonus (int bonus);
    
    public void detailKaryawan () {
        System.out.println("ID : " + this.id);
        System.out.println("Nama : " + this.nama);
        System.out.println("Gaji : " + this.gaji);
        System.out.println("Bonus : " + this.bonus);
    }
}
