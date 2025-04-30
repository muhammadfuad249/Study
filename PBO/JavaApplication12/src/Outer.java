/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Legion 5 Pro
 */
public class Outer {
    int a = 10;

    class Inner {
        void aksesOuter() {
            System.out.println("Nilai a : " + a);
        }
    }

    void AksesInner() {
        Inner inner = new Inner();
        inner.aksesOuter();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.AksesInner(); // Output: Nilai dari outerVar: 10

        // Cara lain untuk membuat instance Inner dari luar Outer
        Outer.Inner inner2 = outer.new Inner();
        inner2.aksesOuter(); // Output: Nilai dari outerVar: 10
    }
}
