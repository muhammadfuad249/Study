/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP1;

/**
 *
 * @author ALDI
 */

class Hewan {
    void suara() {
        System.out.println("Hewan bersuara....");
    }
}

// Subclass
class Kucing extends Hewan {
    // Overriding method suara()
    @Override
    void suara() {
        System.out.println("Harimau: Roar!");
    }
}

public class Modul55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hewan h = new Hewan();
        h.suara();  // Output: Hewan mengeluarkan suara.

        Kucing k = new Kucing();
        k.suara();  // Output: Kucing: Meong~
    }
    
}
