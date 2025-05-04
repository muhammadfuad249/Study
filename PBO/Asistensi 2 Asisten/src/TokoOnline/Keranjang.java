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
    private static final int MAX_SIZE = 100;

    public Keranjang() {
        this.produk = new Produk[MAX_SIZE];
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public void addProduct(Produk productById) {
        if (productById != null) {
            if (size >= produk.length) {
                Produk[] newProducts = new Produk[produk.length * 2];
                System.arraycopy(produk, 0, newProducts, 0, produk.length);
                produk = newProducts;
            }
            produk[size++] = productById;
        }
    }

    @Override
    public Produk[] getProducts() {
        Produk[] result = new Produk[size];
        System.arraycopy(produk, 0, result, 0, size);
        return result;
    }

    @Override
    public void clear() {
        produk = new Produk[MAX_SIZE];
        size = 0;
    }

    @Override
    public void addProduct(InProduk productById) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
