/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */
public class Pesanan implements InPesanan {
    private int customerId;
    private InProduk[] products;
    private String kartuKredit;

    public Pesanan() {}

    public Pesanan(int customerId, InProduk[] products) {
        this.customerId = customerId;
        this.products = products;
    }

    @Override
    public boolean isCreditCardNumberValid(String userInput) {
        return userInput != null && userInput.matches("\\d{16}");
    }

    @Override
    public void setKartuKredit(String userInput) {
        this.kartuKredit = userInput;
    }

    @Override
    public void setProducts(InProduk[] products) {
        this.products = products;
    }

    @Override
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public int getCustomerId() {
        return customerId;
    }

    public InProduk[] getProducts() {
        return products;
    }
}
