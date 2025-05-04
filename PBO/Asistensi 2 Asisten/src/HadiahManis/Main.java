/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HadiahManis;

/**
 *
 * @author Legion 5 Pro
 */
public class Main {
    public static void main(String[] args) {
        Hadiah hadiah = new Hadiah();
        hadiah.addSweet(new Candy("Permen Coklat", 0.1, 0.11));
        hadiah.addSweet(new Lollipop("Lollipop Himawari", 0.05, 0.04));
        hadiah.addSweet(new Cookie("Chocolate Cookie", 0.08, 0.12));

        System.out.println("All sweets: " + java.util.Arrays.toString(hadiah.getSweets()));
        System.out.println("Total weight: " + hadiah.calculateTotalWeight());
        System.out.println("Sweets with sugar weight 0.03-0.05: " +
                java.util.Arrays.toString(hadiah.filterSweetsBySugarRange(0.03, 0.05)));
    }
}
