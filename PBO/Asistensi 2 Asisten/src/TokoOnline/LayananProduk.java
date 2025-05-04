/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */
public class LayananProduk implements InLayananProduk {
    private static LayananProduk instance;
    private Produk[] produk;
    private int size;
    private static final int MAX_SIZE = 100;

    private LayananProduk() {
        produk = new Produk[MAX_SIZE];
        size = 0;
        // Sample products
        addProduct(new Produk(1, "Laptop", "Electronics", 999.99));
        addProduct(new Produk(2, "Phone", "Electronics", 499.99));
        addProduct(new Produk(3, "Book", "Books", 19.99));
    }

    public static LayananProduk getInstance() {
        if (instance == null) {
            instance = new LayananProduk();
        }
        return instance;
    }

    private void addProduct(Produk product) {
        if (size >= produk.length) {
            Produk[] newProducts = new Produk[produk.length * 2];
            System.arraycopy(produk, 0, newProducts, 0, produk.length);
            produk = newProducts;
        }
        produk[size++] = product;
    }

    @Override
    public Produk[] getProduk() {
        Produk[] hasil = new Produk[size];
        System.arraycopy(produk, 0, hasil, 0, size);
        return hasil;
    }

    @Override
    public Produk getProductById(int productIdToAddToCart) {
        for (int i = 0; i < size; i++) {
            if (produk[i].getId() == productIdToAddToCart) {
                return produk[i];
            }
        }
        return null;
    }

    public void clearServiceState() {
        produk = new Produk[MAX_SIZE];
        size = 0;
    }
}