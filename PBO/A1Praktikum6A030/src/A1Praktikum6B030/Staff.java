/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package A1Praktikum6B030;

/**
 *
 * @author Legion 5 Pro
 */
public class Staff extends Karyawan{
    
    String jabatan;
    
    public Staff (int id, String nama, int gaji, int bonus) {
        super(id, nama, gaji, bonus);
    }
    
    public String getJabatan() {
        return this.jabatan;
    }
    
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    @Override
    public void updateJabatan (String jabatan) {
        this.jabatan = jabatan;
    }
    
    @Override
    public void updateGaji (int gaji) {
        super.gaji = gaji;
    }
    
    @Override
    public void updateBonus (int bonus) {
        super.bonus = bonus;
    }
}
