/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiBelanja;

/**
 *
 * @author Legion 5 Pro
 */
public class Order {
    private User user;
    private Product product;
    private int quantity;

    public Order(User user, Product product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() { return user; }
    public Product getProduct(int i) { return product; }
    public int getQuantity() { return quantity; }

}
