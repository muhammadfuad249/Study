/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokoOnline;

/**
 *
 * @author Legion 5 Pro
 */
public class LayananPengguna implements InLayananPengguna {
    private static LayananPengguna instance;
    private Pengguna[] pengguna;
    private int size;
    private static final int MAX_SIZE = 100;

    private LayananPengguna() {
        pengguna = new Pengguna[MAX_SIZE];
        size = 0;
    }

    public static LayananPengguna getInstance() {
        if (instance == null) {
            instance = new LayananPengguna();
        }
        return instance;
    }

    public String registerUser(Pengguna user) {
        if (user == null || user.getEmail() == null || user.getEmail().isEmpty()) {
            return "You have to input email to register. Please, try one more time";
        }
        for (int i = 0; i < size; i++) {
            if (pengguna[i].getEmail().equals(user.getEmail())) {
                return "This email is already used by another user. Please, use another email";
            }
        }
        if (size >= pengguna.length) {
            Pengguna[] newUsers = new Pengguna[pengguna.length * 2];
            System.arraycopy(pengguna, 0, newUsers, 0, pengguna.length);
            pengguna = newUsers;
        }
        pengguna[size++] = user;
        return "New user is created";
    }

    @Override
    public Pengguna[] getPengguna() {
        Pengguna[] hasil = new Pengguna[size];
        System.arraycopy(pengguna, 0, hasil, 0, size);
        return hasil;
    }

    @Override
    public Pengguna getUserByEmail(String userEmail) {
        for (int i = 0; i < size; i++) {
            if (pengguna[i].getEmail().equals(userEmail)) {
                return pengguna[i];
            }
        }
        return null;
    }

    public void clearServiceState() {
        pengguna = new Pengguna[MAX_SIZE];
        size = 0;
        Pengguna.clearState();
    }

    @Override
    public String registerUser(InPengguna user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}