/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoripbo;

/**
 *
 * @author firstiyantiputri
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aksesuas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Perhitungan Bangun Datar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel label = new JLabel("Pilih bangun datar:");
        panel.add(label);

        String[] options = {"Persegi", "Persegi Panjang", "Segitiga", "Lingkaran"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        panel.add(comboBox);

        JButton calculateButton = new JButton("Hitung");
        panel.add(calculateButton);

        JTextArea resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        panel.add(new JScrollPane(resultArea));

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();
                resultArea.setText("");

                if (selected.equals("Persegi")) {
                    double sisi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi persegi:"));
                    double luas = sisi * sisi;
                    double keliling = 4 * sisi;
                    resultArea.setText("Luas Persegi: " + luas + "\nKeliling Persegi: " + keliling);
                } else if (selected.equals("Persegi Panjang")) {
                    double panjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan panjang persegi panjang:"));
                    double lebar = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi panjang:"));
                    double luas = panjang * lebar;
                    double keliling = 2 * (panjang + lebar);
                    resultArea.setText("Luas Persegi Panjang: " + luas + "\nKeliling Persegi Panjang: " + keliling);
                } else if (selected.equals("Segitiga")) {
                    double alas = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga:"));
                    double tinggi = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi segitiga:"));
                    double sisiMiring = Double.parseDouble(JOptionPane.showInputDialog("Masukkan sisi miring segitiga:"));
                    double luas = 0.5 * alas * tinggi;
                    double keliling = alas + tinggi + sisiMiring;
                    resultArea.setText("Luas Segitiga: " + luas + "\nKeliling Segitiga: " + keliling);
                } else if (selected.equals("Lingkaran")) {
                    double jejari = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jejari lingkaran:"));
                    double luas = Math.PI * jejari * jejari;
                    double keliling = 2 * Math.PI * jejari;
                    resultArea.setText("Luas Lingkaran: " + luas + "\nKeliling Lingkaran: " + keliling);
                }
            }
        });

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}

