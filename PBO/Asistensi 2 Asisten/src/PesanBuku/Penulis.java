/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PesanBuku;

/**
 *
 * @author Legion 5 Pro
 */
public class Penulis {
    private int id;
    private String firstName;
    private String lastName;

//    public Author() {}

    public Penulis(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setId(int id) { 
        this.id = id; 
    }
    public int getId() { 
        return id; 
    }
    public void setFirstName(String firstName) { 
        this.firstName = firstName; 
    }
    public String getFirstName() { 
        return firstName; 
    }
    public void setLastName(String lastName) { 
        this.lastName = lastName; 
    }
    public String getLastName() { 
        return lastName; 
    }

    @Override
    public String toString() {
        return "{" + id + "}, " + firstName + lastName;
    }
}
