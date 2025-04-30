/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Legion 5 Pro
 */
import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String nama;
    float harga;

    public Item (String nama, float harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String toString() {
        return nama + " - Rp " + harga;
    }
}

public class menuBelanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> daftarBelanja = new ArrayList<>();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Item Belanjaan");
            System.out.println("2. Hapus Item Belanjaan");
            System.out.println("3. Tampilkan Seluruh Item Belanjaan");
            System.out.println("4. Cari Item Belanjaan");
            System.out.println("0. Keluar dari program");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Item Belanjaan: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan Harga Item Belanjaan: ");
                float harga = scanner.nextFloat();
                daftarBelanja.add(new Item(nama, harga));
                System.out.println("Item Belanjaan Telah Ditambahkan!");
            } 
            else if (pilihan == 2) {
                System.out.print("Masukkan Nama Item Belanjaan yang akan dihapus: ");
                String nama = scanner.nextLine();
                boolean ditemukan = false;
                
                for (int i = 0; i < daftarBelanja.size(); i++) {
                    if (daftarBelanja.get(i).nama.equalsIgnoreCase(nama)) {
                        daftarBelanja.remove(i);
                        ditemukan = true;
                        System.out.println("Item Belanjaan telah dihapus!");
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Item Belanjaan tidak ditemukan!");
                }
            } 
            else if (pilihan == 3) {
                if (daftarBelanja.isEmpty()) {
                    System.out.println("Tidak ada item belanjaan.");
                } else {
                    float totalHarga = 0;
                    System.out.println("\nSeluruh Item");
                    System.out.println("============");
                    for (Item item : daftarBelanja) {
                        System.out.println(item);
                        totalHarga += item.harga;
                    }
                    System.out.println("Total Harga: Rp " + totalHarga);
                }
            } 
            else if (pilihan == 4) {
                System.out.print("Masukkan Nama Item Belanjaan yang dicari: ");
                String nama = scanner.nextLine();
                boolean ditemukan = false;

                for (Item item : daftarBelanja) {
                    if (item.nama.equalsIgnoreCase(nama)) {
                        System.out.println("Item Ditemukan: " + item);
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Item Belanjaan tidak ditemukan!");
                }
            } 
            else if (pilihan == 0) {
                System.out.println("Terima kasih telah menggunakan program ini!");
                break;
            } 
            else {
                System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }

        scanner.close();
    }
}

