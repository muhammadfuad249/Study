/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pembelanjaan;

/**
 *
 * @author Legion 5 Pro
 */
public class ClearScreen {
    public void ClearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
