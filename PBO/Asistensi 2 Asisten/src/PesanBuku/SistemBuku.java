/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PesanBuku;

/**
 *
 * @author Legion 5 Pro
 */

public class SistemBuku {
    public Buku[] filterBooksByAuthor(Penulis penulis, Buku[] books) {
        int count = 0;
        for (Buku book : books) {
            for (Penulis bookPenulis : book.getPenulis()) {
                if (bookPenulis.getId() == penulis.getId()) {
                    count++;
                    break;
                }
            }
        }
        Buku[] filteredBooks = new Buku[count];
        int index = 0;
        for (Buku book : books) {
            for (Penulis bookPenulis : book.getPenulis()) {
                if (bookPenulis.getId() == penulis.getId()) {
                    filteredBooks[index++] = book;
                    break;
                }
            }
        }
        return filteredBooks;
    }

    public Buku[] filterBooksByPublisher(Penerbit penerbit, Buku[] books) {
        int count = 0;
        for (Buku book : books) {
            if (book.getPenerbit().getId() == penerbit.getId()) {
                count++;
            }
        }
        Buku[] filteredBooks = new Buku[count];
        int index = 0;
        for (Buku book : books) {
            if (book.getPenerbit().getId() == penerbit.getId()) {
                filteredBooks[index++] = book;
            }
        }
        return filteredBooks;
    }

    public Buku[] filterBooksAfterSpecifiedYear(int tahunSekarang, Buku[] books) {
        int count = 0;
        for (Buku book : books) {
            if (book.getTahunTerbit() >= tahunSekarang) {
                count++;
            }
        }
        Buku[] filteredBooks = new Buku[count];
        int index = 0;
        for (Buku book : books) {
            if (book.getTahunTerbit() >= tahunSekarang) {
                filteredBooks[index++] = book;
            }
        }
        return filteredBooks;
    }
}
