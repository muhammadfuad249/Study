/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */

public class Keranjang implements InKeranjang {
    private Produk[] produk;
    private int size;
    private static final int INITIAL_CAPACITY = 100;

    public Keranjang() {
        this.produk = new Produk[INITIAL_CAPACITY];
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addProduct(InProduk productById) {
        if (productById == null) {
            return;
        }
        if (size >= produk.length) {
            // Perbesar array dengan ukuran minimal yang cukup
            int newCapacity = Math.max(produk.length * 2, produk.length + 1);
            Produk[] newProducts = new Produk[newCapacity];
            System.arraycopy(produk, 0, newProducts, 0, size);
            produk = newProducts;
            // System.out.println("Resized products array to: " + newCapacity); // Debug
        }
        produk[size++] = (Produk) productById;
        // System.out.println("Added product: " + productById.getProductName()); // Debug
    }

    @Override
    public Produk[] getProducts() {
        Produk[] result = new Produk[size];
        System.arraycopy(produk, 0, result, 0, size);
        return result;
    }

    @Override
    public void clear() {
        // Pertahankan kapasitas saat ini
        produk = new Produk[produk.length];
        size = 0;
        // System.out.println("Cleared cart"); // Debug
    }
}
