/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */
public interface InKeranjang {
    boolean isEmpty();
    void addProduct(InProduk productById);
    InProduk[] getProducts();
    void clear();
}
