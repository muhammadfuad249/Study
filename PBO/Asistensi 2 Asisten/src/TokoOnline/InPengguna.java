/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */
public interface InPengguna {
    String getFirstName();
    String getLastName();
    String getPassword();
    String getEmail();
    int getId();
    void setPassword(String newPassword);
    void setEmail(String newEmail);
}
