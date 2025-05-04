/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HadiahManis;

/**
 *
 * @author Legion 5 Pro
 */
public class Hadiah {
    private Manis[] manis;
    private int size;
    private static final int MAX_SIZE = 100;

    public Hadiah() {
        this.manis = new Manis[MAX_SIZE];
        this.size = 0;
    }

    public void addSweet(Manis sweet) {
        if (sweet == null) {
            return;
        }
        if (size >= manis.length) {
            // Perbesar array jika penuh
            Manis[] newSweets = new Manis[manis.length * 2];
            System.arraycopy(manis, 0, newSweets, 0, manis.length);
            manis = newSweets;
        }
        manis[size++] = sweet;
    }

    public Manis[] getSweets() {
        // Kembalikan array tanpa null
        Manis[] hasil = new Manis[size];
        System.arraycopy(manis, 0, hasil, 0, size);
        return hasil;
    }

    public Manis[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
        // Hitung jumlah sweet yang memenuhi kriteria
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (manis[i].getSugarWeight() >= minSugarWeight && manis[i].getSugarWeight() <= maxSugarWeight) {
                count++;
            }
        }

        Manis[] filteredSweets = new Manis[count];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (manis[i].getSugarWeight() >= minSugarWeight && manis[i].getSugarWeight() <= maxSugarWeight) {
                filteredSweets[index++] = manis[i];
            }
        }
        return filteredSweets;
    }

    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < size; i++) {
            totalWeight += manis[i].getWeight();
        }
        return totalWeight;
    }
}
