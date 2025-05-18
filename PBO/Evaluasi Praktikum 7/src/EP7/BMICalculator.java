/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EP7;

/**
 *
 * @author Legion 5 Pro
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator extends JFrame {

    private JTextField beratField;
    private JTextField tinggiField;
    private JLabel hasilLabel;

    public BMICalculator() {
        setTitle("Kalkulator BMI - Body Mass Index");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Komponen
        JLabel beratLabel = new JLabel("     Berat (kg):");
        beratField = new JTextField();

        JLabel tinggiLabel = new JLabel("     Tinggi (m):");
        tinggiField = new JTextField();

        JButton hitungButton = new JButton("Hitung BMI");

        hasilLabel = new JLabel("");

        // Tambahkan komponen ke frame
        add(beratLabel);
        add(beratField);
        add(tinggiLabel);
        add(tinggiField);
        add(new JLabel()); // Kosong
        add(hitungButton);
        add(new JLabel("     Hasil:"));
        add(hasilLabel);

        // Aksi tombol
        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hitungBMI();
            }
        });
    }

    private void hitungBMI() {
        try {
            double berat = Double.parseDouble(beratField.getText());
            double tinggi = Double.parseDouble(tinggiField.getText());

            // Jika tinggi > 3, kita anggap satuan cm dan konversi ke meter
            if (tinggi > 3) {
                tinggi = tinggi / 100.0;
            }

            if (tinggi <= 0 || berat <= 0) {
                hasilLabel.setText("Tinggi dan berat harus lebih dari 0");
                return;
            }

            double bmi = berat / (tinggi * tinggi);
            String kategori = getKategoriBMI(bmi);

            hasilLabel.setText(String.format("BMI: %.2f (%s)", bmi, kategori));

        } catch (NumberFormatException e) {
            hasilLabel.setText("Masukkan angka yang valid!");
        }
    }
    
    private String getKategoriBMI(double bmi) {
        if (bmi < 18.5) return "Kurang berat badan";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Kelebihan berat badan";
        else if (bmi < 35) return "Obesitas kelas 1";
        else if (bmi < 40) return "Obesitas kelas 2";
        else return "Obesitas kelas 3";
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new BMICalculator().setVisible(true);
        });
    }
}
