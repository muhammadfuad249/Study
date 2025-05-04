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
    private static final int MAX_SIZE = 100;

    private LayananPesanan() {
        pesan = new Pesanan[MAX_SIZE];
        size = 0;
    }

    public static LayananPesanan getInstance() {
        if (instance == null) {
            instance = new LayananPesanan();
        }
        return instance;
    }

    public void addOrder(Pesanan order) {
        if (order != null) {
            if (size >= pesan.length) {
                Pesanan[] newOrders = new Pesanan[pesan.length * 2];
                System.arraycopy(pesan, 0, newOrders, 0, pesan.length);
                pesan = newOrders;
            }
            pesan[size++] = order;
        }
    }

    @Override
    public Pesanan[] getOrdersByUserId(int userId) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (pesan[i].getCustomerId() == userId) {
                count++;
            }
        }

        Pesanan[] userOrders = new Pesanan[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (pesan[i].getCustomerId() == userId) {
                userOrders[index++] = pesan[i];
            }
        }
        return userOrders;
    }

    @Override
    public Pesanan[] getOrders() {
        Pesanan[] result = new Pesanan[size];
        System.arraycopy(pesan, 0, result, 0, size);
        return result;
    }

    public void clearServiceState() {
        pesan = new Pesanan[MAX_SIZE];
        size = 0;
    }

    @Override
    public void addOrder(InPesanan order) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}