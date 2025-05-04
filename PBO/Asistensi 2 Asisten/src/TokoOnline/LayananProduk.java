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
    private static final int INITIAL_CAPACITY = 100;

    private LayananProduk() {
        produk = new Produk[INITIAL_CAPACITY];
        size = 0;
        addProduct(new Produk(1, "Air", "Makanan", 6500));
        addProduct(new Produk(2, "Sapu", "Peralatan", 15000));
        addProduct(new Produk(3, "Susu", "Makanan", 42000));
    }

    public static LayananProduk getInstance() {
        if (instance == null) {
            instance = new LayananProduk();
        }
        return instance;
    }

    private void addProduct(InProduk product) {
        if (product == null) {
            return;
        }
        if (size >= produk.length) {
            int newCapacity = Math.max(produk.length * 2, produk.length + 1);
            Produk[] newProducts = new Produk[newCapacity];
            System.arraycopy(produk, 0, newProducts, 0, size);
            produk = newProducts;
            // System.out.println("Resized products array to: " + newCapacity); // Debug
        }
        produk[size++] = (Produk) product;
        // System.out.println("Added product: " + product.getProductName()); // Debug
    }

    @Override
    public Produk[] getProduk() {
        Produk[] result = new Produk[size];
        System.arraycopy(produk, 0, result, 0, size);
        return result;
    }

    @Override
    public Produk getProductById(int productIdToAddToCart) {
        for (int i = 0; i < size; i++) {
            if (produk[i] != null && produk[i].getId() == productIdToAddToCart) {
                return produk[i];
            }
        }
        return null;
    }

    public void clearServiceState() {
        produk = new Produk[produk.length];
        size = 0;
        // System.out.println("Cleared product service state"); // Debug
    }
}