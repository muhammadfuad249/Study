/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */
public interface InPesanan {
    boolean isCreditCardNumberValid(String userInput);
    void setKartuKredit(String userInput);
    void setProducts(InProduk[] products);
    void setCustomerId(int customerId);
    int getCustomerId();
}
