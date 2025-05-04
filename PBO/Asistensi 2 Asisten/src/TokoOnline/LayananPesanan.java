/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */
public class LayananPesanan implements InLayananPesanan {
    private static LayananPesanan instance;
    private Pesanan[] pesan;
    private int size;
    private static final int INITIAL_CAPACITY = 100;

    private LayananPesanan() {
        pesan = new Pesanan[INITIAL_CAPACITY];
        size = 0;
    }

    public static LayananPesanan getInstance() {
        if (instance == null) {
            instance = new LayananPesanan();
        }
        return instance;
    }

    @Override
    public void addOrder(InPesanan order) {
        if (order == null) {
            return;
        }
        if (size >= pesan.length) {
            int newCapacity = Math.max(pesan.length * 2, pesan.length + 1);
            Pesanan[] newOrders = new Pesanan[newCapacity];
            System.arraycopy(pesan, 0, newOrders, 0, size);
            pesan = newOrders;
            // System.out.println("Resized orders array to: " + newCapacity); // Debug
        }
        pesan[size++] = (Pesanan) order;
        // System.out.println("Added order for user: " + order.getCustomerId()); // Debug
    }

    @Override
    public Pesanan[] getOrdersByUserId(int userId) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (pesan[i] != null && pesan[i].getCustomerId() == userId) {
                count++;
            }
        }

        Pesanan[] userOrders = new Pesanan[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (pesan[i] != null && pesan[i].getCustomerId() == userId) {
                userOrders[index++] = pesan[i];
            }
        }
        return userOrders;
    }

    @Override
    public Pesanan[] getPesan() {
        Pesanan[] result = new Pesanan[size];
        System.arraycopy(pesan, 0, result, 0, size);
        return result;
    }

    public void clearServiceState() {
        pesan = new Pesanan[pesan.length];
        size = 0;
        // System.out.println("Cleared order service state"); // Debug
    }
}