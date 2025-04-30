/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Belajar1;

/**
 *
 * @author Legion 5 Pro
 */
import java.io.IOException;

public class Utils {
    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
            System.out.println("[Gagal membersihkan layar]");
        }
    }

    public static void pause() {
        System.out.println("\nTekan ENTER untuk melanjutkan...");
        try {
            System.in.read();
        } catch (Exception e) {}
    }
}
