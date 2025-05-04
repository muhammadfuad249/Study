/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */
public class Produk implements InProduk {
    private int id;
    private String productName;
    private String categoryName;
    private double price;

    public Produk(int id, String productName, String categoryName, double price) {
        this.id = id;
        this.productName = productName;
        this.categoryName = categoryName;
        this.price = price;
    }

    @Override
    public int getId() { return id; }
    @Override
    public String getProductName() { return productName; }
    public String getCategoryName() { return categoryName; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Product{id=" + id + ", productName='" + productName + "', categoryName='" +
               categoryName + "', price=" + price + "}";
    }
}
