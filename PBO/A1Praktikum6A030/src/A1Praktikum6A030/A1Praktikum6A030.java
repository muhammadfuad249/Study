/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A1Praktikum6A030;

/**
 *
 * @author Legion 5 Pro
 */
//import A1Praktikum6A030.transaksi.TransaksiTabungan;

public class A1Praktikum6A030 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TransaksiGiro transaksiGiro = new TransaksiGiro(5000000);
        transaksiGiro.setor(2000000);
        transaksiGiro.tarik(4000000);
        
        System.out.println("\n");
        
        TransaksiTabungan transaksiTabungan = new TransaksiTabungan(2000000);
        transaksiTabungan.setor(3000000);
        transaksiTabungan.tarik(250000);
    }
    
}
