/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HadiahManis;

/**
 *
 * @author Legion 5 Pro
 */
public abstract class Manis {
    protected String nama;
    protected double weight;
    protected double sugarWeight;

    public Manis(String name, double weight, double sugarWeight) {
        this.nama = name;
        this.weight = weight;
        this.sugarWeight = sugarWeight;
    }

    
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    public String getNama() { 
        return nama; 
    }
    public void setWeight(double weight) { 
        this.weight = weight; 
    }
    public double getWeight() { 
        return weight; 
    }
    public void setSugarWeight(double sugarWeight) { 
        this.sugarWeight = sugarWeight; 
    }
    public double getSugarWeight() { 
        return sugarWeight; 
    }

    @Override
    public String toString() {
        return "Sweet{Nama : " + nama + ", Berat :" + weight + ", Kadar Gula : " + sugarWeight + "}";
    }
}
