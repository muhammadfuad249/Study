/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HadiahManis;

/**
 *
 * @author Legion 5 Pro
 */
public class Lollipop extends Manis {
    public Lollipop(String nama, double weight, double sugarWeight) {
        super(nama, weight, sugarWeight);
    }

    @Override
    public String toString() {
        return "Lollipop{Nama : " + nama + ", Berat :" + weight + ", Kadar Gula : " + sugarWeight + "}";
    }
}
