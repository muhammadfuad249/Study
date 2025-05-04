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

public class Menu {
    public int pilih;
    String nama;
    String username;
    String password;
    Scanner input = new Scanner(System.in);
    Akun akun = new Akun();
    SignUpAdmin sua;
    ClearScreen cls = new ClearScreen();

    public Menu() {
        this.sua = new SignUpAdmin(nama, username, password);
    }
    public void menuUtama() {
        do{
            cls.ClearScreen();
            System.out.println("Selamat Datang");
            System.out.println("==============\n");
            System.out.println("1. Sign Up");
            System.out.println("2. Sign In");
            System.out.println("3. Product Catalog");
            System.out.println("4. Exit\n");
            System.out.println("Pilihan : ");

            pilih = input.nextInt();
            
            switch (pilih) {
                case 1 : 
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Username: ");
                    String username = input.nextLine();
                    System.out.print("Masukkan Password: ");
                    String password = input.nextLine();
                    input.nextLine(); // Membersihkan newline
                    SignUpAdmin sua = new SignUpAdmin(nama, username, password);
                    akun.tambahAdmin(sua);
            }
        }while (pilih != 4);
        
    }
    
    public void menuDaftar() {
        char ch = 0;
        do{
            cls.ClearScreen();
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("Pilihan : ");

            pilih = input.nextInt();
            
            switch (pilih) {
                case 1 : 
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Username: ");
                    String username = input.nextLine();
                    System.out.print("Masukkan Password: ");
                    String password = input.nextLine();
                    input.nextLine(); // Membersihkan newline
                    SignUpAdmin sua = new SignUpAdmin(nama, username, password);
                    akun.tambahAdmin(sua);
                    System.out.println("Apakah ingin melanjutkan (y/n) : ");
                    ch = input.next().charAt(0);
                    if (ch !='y' || ch != 'Y') {
                        return;
                    }
                    break;
                case 2 : 
                    System.out.print("Masukkan Nama: ");
                    String nama2 = input.nextLine();
                    System.out.print("Masukkan Username: ");
                    String username2 = input.nextLine();
                    System.out.print("Masukkan Password: ");
                    String password2 = input.nextLine();
                    input.nextLine(); // Membersihkan newline
                    SignUpUser suu = new SignUpUser(nama2, username2, password2);
                    akun.tambahUser(suu);
                    ch = input.next().charAt(0);
                    if (ch !='y' || ch != 'Y') {
                        return;
                    }
                    break;
                default : 
                    break;
            }
        }while (ch !='y' || ch != 'Y');
    }
    
    public void menuMasuk() {
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Username: ");
        String username = input.nextLine();
        System.out.print("Masukkan Password: ");
        String password = input.nextLine();
        input.nextLine();
        
        if (sua.equals(username) == true) {
            System.out.println("1. Sign Out");
            System.out.println("2. Product Catalog");
            System.out.println("3. Product Management");
        }
    }
    
    public void menuInsert() {
        
    }
}
