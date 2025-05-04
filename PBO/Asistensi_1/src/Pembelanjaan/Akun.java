/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembelanjaan;

/**
 *
 * @author Legion 5 Pro
 */
import java.util.*;

public class Akun {
    private ArrayList<SignUpAdmin> daftarAkunAdmin;
    private ArrayList<SignUpUser> daftarAkunUser;
    
    public Akun() {
        daftarAkunAdmin = new ArrayList<>();
        daftarAkunUser = new ArrayList<>();
    }
    
    public void tambahAdmin (SignUpAdmin sua) {
        daftarAkunAdmin.add(sua);
    }
    
    public void tambahUser (SignUpUser suu) {
        daftarAkunUser.add(suu);
    }
}
