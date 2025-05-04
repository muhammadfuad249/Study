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
    private static final int INITIAL_CAPACITY = 100;

    private LayananPengguna() {
        pengguna = new Pengguna[INITIAL_CAPACITY];
        size = 0;
    }

    public static LayananPengguna getInstance() {
        if (instance == null) {
            instance = new LayananPengguna();
        }
        return instance;
    }

    @Override
    public String registerUser(InPengguna user) {
        if (user == null || user.getEmail() == null || user.getEmail().isEmpty()) {
            return "You have to input email to register. Please, try one more time";
        }
        for (int i = 0; i < size; i++) {
            if (pengguna[i] != null && pengguna[i].getEmail().equals(user.getEmail())) {
                return "This email is already used by another user. Please, use another email";
            }
        }
        if (size >= pengguna.length) {
            int newCapacity = Math.max(pengguna.length * 2, pengguna.length + 1);
            Pengguna[] newUsers = new Pengguna[newCapacity];
            System.arraycopy(pengguna, 0, newUsers, 0, size);
            pengguna = newUsers;
            // System.out.println("Resized users array to: " + newCapacity); // Debug
        }
        pengguna[size++] = (Pengguna) user;
        // System.out.println("Registered user: " + user.getEmail()); // Debug
        return "New user is created";
    }

    @Override
    public Pengguna[] getPengguna() {
        Pengguna[] result = new Pengguna[size];
        System.arraycopy(pengguna, 0, result, 0, size);
        return result;
    }

    @Override
    public Pengguna getUserByEmail(String userEmail) {
        if (userEmail != null) {
            for (int i = 0; i < size; i++) {
                if (pengguna[i] != null && userEmail.equals(pengguna[i].getEmail())) {
                    return pengguna[i];
                }
            }
        }
        return null;
    }

    public void clearServiceState() {
        pengguna = new Pengguna[pengguna.length];
        size = 0;
        Pengguna.clearState();
        // System.out.println("Cleared user service state"); // Debug
    }
}