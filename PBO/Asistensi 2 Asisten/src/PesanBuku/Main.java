/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PesanBuku;

/**
 *
 * @author Legion 5 Pro
 */
import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Buku[] books = new Buku[] {
            new Buku(1, "Atomic Habits", new Penulis[] { new Penulis(1, "James ", "Clear") },
                     new Penerbit(1, "Gramedia Pustaka Utama"), 2018, 351,
                     BigDecimal.valueOf(74250), Sampul.PAPERBACK),
            new Buku(2, "Black Showman Dan Pembunuhan Di Kota Tak Bernama", new Penulis[] { new Penulis(1, "Keigo ", "Higashino") },
                     new Penerbit(2, "Gramedia Pustaka Utama"), 2021, 516,
                     BigDecimal.valueOf(147000), Sampul.PAPERBACK),
            new Buku(3, "The Devotion of Suspect X", new Penulis[] { new Penulis(3, "Keigo ", "Higashino") },
                     new Penerbit(1, "Bungeishunju Ltd."), 2005, 352,
                     BigDecimal.valueOf(103000), Sampul.HARDCOVER),
            new Buku(4, "Secrets of Divine Love: Sebuah Perjalanan Spiritual yang Mendalam tentang Islam", new Penulis[] { new Penulis(4, "Helwa ", "Auzura") },
                     new Penerbit(3, "Elex Media Komputindo"), 2022, 440,
                     BigDecimal.valueOf(120000), Sampul.PAPERBACK)
        };

        SistemBuku bookService = new SistemBuku();

        Penulis penulis = new Penulis(1, "Helwa ", "Auzura");
        Buku[] booksByAuthor = bookService.filterBooksByAuthor(penulis, books);
        System.out.println("Ditulis oleh " + penulis + ":");
        System.out.println(Arrays.toString(booksByAuthor));

        Penerbit penerbit = new Penerbit(1, "Bungeishunju Ltd.");
        Buku[] booksByPublisher = bookService.filterBooksByPublisher(penerbit, books);
        System.out.println("\nDiterbitkan oleh " + penerbit + ":");
        System.out.println(Arrays.toString(booksByPublisher));

        int year = 2000;
        Buku[] booksAfterYear = bookService.filterBooksAfterSpecifiedYear(year, books);
        System.out.println("\nBuku yang diterbitkan setelah tahun " + year + ":");
        System.out.println(Arrays.toString(booksAfterYear));
    }
}
