/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */
public class LogicSystem {
    private static LogicSystem instance;
    private InPengguna loggedInUser;
    private InMenu mainMenu;
    private InKeranjang sessionCart;

    private LogicSystem() {
    }

    public void setLoggedInUser(InPengguna user) {
        if (this.sessionCart != null) {
            this.sessionCart.clear(); // we have to clear session cart when new user is logged in
        }
        this.loggedInUser = user;
    }

    public InPengguna getLoggedInUser() {
        return this.loggedInUser;
    }

    public void setMainMenu(InMenu menu) {
        this.mainMenu = menu;
    }

    public InMenu getMainMenu() {
        return this.mainMenu;
    }

    public static LogicSystem getInstance() {
        if (instance == null) {
            instance = new LogicSystem();
        }
        return instance;
    }

    public InKeranjang getSessionCart() {
        if (this.sessionCart == null) {
            this.sessionCart = new Keranjang();
        }
        return this.sessionCart;
    }
}
