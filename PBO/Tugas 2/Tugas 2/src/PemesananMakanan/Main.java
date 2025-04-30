/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PemesananMakanan;

/**
 *
 * @author Legion 5 Pro
 */
public class Main {
    public static void main(String[] args) {
        Makanan burger = new FastFood("Cheeseburger", 17000);
        Makanan salad = new HealthyFood("Caesar Salad", 21000);

        burger.tampil();
        burger.persiapan();
        ((Pesanan) burger).pesan();

        System.out.println();

        salad.tampil();
        salad.persiapan();
        ((Pesanan) salad).pesan();
    }
}

