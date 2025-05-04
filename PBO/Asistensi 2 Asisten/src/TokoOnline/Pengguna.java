/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */
public class Pengguna implements InPengguna {
    private static int userCounter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    public Pengguna(String firstName, String lastName, String password, String email) {
        this.id = userCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public static void clearState() {
        userCounter = 0;
    }

    @Override
    public int getId() { return id; }
    @Override
    public String getFirstName() { return firstName; }
    @Override
    public String getLastName() { return lastName; }
    @Override
    public String getPassword() { return password; }
    @Override
    public String getEmail() { return email; }
    @Override
    public void setPassword(String newPassword) { this.password = newPassword; }
    @Override
    public void setEmail(String newEmail) { this.email = newEmail; }

    @Override
    public String toString() {
        return "User{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName +
               "', email='" + email + "'}";
    }
}
