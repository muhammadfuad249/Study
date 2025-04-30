/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Belajar1;

/**
 *
 * @author Legion 5 Pro
 */
import java.util.*;

public class Data{
    public static ArrayList<Pengguna> pengguna = new ArrayList<>();
    public static ArrayList<Item> item = new ArrayList<>();
    public static ArrayList<Pesanan> pesan = new ArrayList<>();

    public static Pengguna getByUsername(String username) {
        for (Pengguna pengguna : pengguna) {
            if (pengguna.username.equals(username)) return pengguna;
        }
        return null;
    }
}

