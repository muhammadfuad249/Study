/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package A1Praktikum6C030;

/**
 *
 * @author Legion 5 Pro
 */
public class A1Praktikum6C030 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Transportasi transportasi = new Transportasi("Kendaraan Laut");
        transportasi.jenisTransportasi();
        
        transportasi = new Mobil("Kendaraan Darat");
        transportasi.jenisTransportasi();
        
        transportasi = new Pesawat("Kendaraan Udara");
        transportasi.jenisTransportasi();
    }
    
}
