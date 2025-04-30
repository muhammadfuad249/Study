/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A1Praktikum6B030;

/**
 *
 * @author Legion 5 Pro
 */
public class A1Praktikum6B030 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen(1, "Mohandes Gandhi", 5000000, 500000);
        dosen.setJabatan("Dosen Tetap");
        dosen.detailKaryawan();
        System.out.println("Jabatan : " + dosen.getJabatan());
        dosen.totalGaji();
        
        System.out.println("\n");
        
        Staff staff = new Staff(2, "John Doe", 2500000, 200000);
        staff.detailKaryawan();
        staff.updateBonus(300000);
        staff.totalGaji();
    }
    
}
