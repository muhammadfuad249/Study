/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MID;

/**
 *
 * @author Legion 5 Pro
 */
public class Nomor10 { //Mil ke Kilometer
    public static void main(String[] args) {
        System.out.println("Mile\tKilometer");
        for (int mile = 1; mile <= 10; mile++) {
            System.out.printf("%d\t%.3f\n", mile, mile * 1.609);
        }
    }
}
