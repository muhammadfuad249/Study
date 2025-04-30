/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum42;

/**
 *
 * @author ALDI
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Tikus();
        Hewan hewan3 = new Sapi();

        hewan1.suara(); // Output: Kucing: Meong!
        hewan2.suara(); // Output: Anjing: Guk guk!
        hewan3.suara(); // Output: Burung: Cuit cuit!
    }
    
}
