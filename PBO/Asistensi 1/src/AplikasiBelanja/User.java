/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AplikasiBelanja;

/**
 *
 * @author Legion 5 Pro
 */
public class User {
    private String name;
    private String username;
    private String password;
    private boolean  role; // admin atau user

    public User(String name, String username, String password, boolean role) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getName() { return name; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public boolean getRole(boolean par) { return role; }
}
