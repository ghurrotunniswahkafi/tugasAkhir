package kuliah.pbo.teori;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PaymentGUI extends PembayaranBlanja  {

    private JFrame frame;
    private JTextField inputTotalBelanja;
    private JTextField inputBayar;
    private JLabel labelKembalian;
    private JTextArea riwayatArea;
    private JComboBox<String> metodeBayarDropdown;

    private ArrayList<String> riwayatTransaksi = new ArrayList<>();

    public PaymentGUI() {
        frame = new JFrame("Kasir Pembayaran");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu menuRiwayat = new JMenu("Menu");
        JMenuItem itemRiwayatWindow = new JMenuItem("Riwayat Transaksi");
        menuRiwayat.add(itemRiwayatWindow);
        menuBar.add(menuRiwayat);
        frame.setJMenuBar(menuBar);

        JPanel panelInput = new JPanel(new GridLayout(4, 2));
        panelInput.setBackground(Color.CYAN);
        
        JLabel labelTotalBelanja = new JLabel("Total Belanja:");
        labelTotalBelanja.setForeground(Color.BLACK);
        
        inputTotalBelanja = new JTextField();
        inputTotalBelanja.setBackground(Color.YELLOW);
        
        JLabel labelBayar = new JLabel("Jumlah Bayar:");
        labelTotalBelanja.setForeground(Color.BLACK);
        
        inputBayar = new JTextField();
        inputBayar.setBackground(Color.YELLOW);
        
        JLabel labelMetode = new JLabel("Metode Bayar:");
        labelTotalBelanja.setForeground(Color.BLACK);
        
        metodeBayarDropdown = new JComboBox<>(new String[]{"Cash", "QRIS", "ShopeePay", "GoPay", "Kredit Card", "Debit Card"});
        JButton buttonHitung = new JButton("Hitung Kembalian");
        buttonHitung.setBackground(Color.GREEN);
        buttonHitung.setForeground(Color.BLACK);
        metodeBayarDropdown.setBackground(Color.RED);
        
        labelKembalian = new JLabel("Kembalian: ");
        labelKembalian.setForeground(Color.RED);

        panelInput.add(labelTotalBelanja);
        panelInput.add(inputTotalBelanja);
        panelInput.add(labelBayar);
        panelInput.add(inputBayar);
        panelInput.add(labelMetode);
        panelInput.add(metodeBayarDropdown);
        panelInput.add(buttonHitung);
        panelInput.add(labelKembalian);

        frame.add(panelInput, BorderLayout.CENTER);

        riwayatArea = new JTextArea();
        riwayatArea.setEditable(false);
        riwayatArea.setBackground(Color.GRAY);
        riwayatArea.setForeground(Color.GRAY);
        JScrollPane scrollPane = new JScrollPane(riwayatArea);
        frame.add(scrollPane, BorderLayout.SOUTH);

        PembayaranBlanja pembayaranBlanja = new PembayaranBlanja();

        buttonHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double totalBelanja = Double.parseDouble(inputTotalBelanja.getText());
                    double jumlahBayar = Double.parseDouble(inputBayar.getText());
                    String metode = (String) metodeBayarDropdown.getSelectedItem();

                    double kembalian;
                    switch (metode) {
                        case "Cash":
                            kembalian = pembayaranBlanja.bayarCash(jumlahBayar, totalBelanja);
                        
                            
                            break;
                        case "QRIS":
                        case "ShopeePay":
                        case "GoPay":
                        case "Kredit Card":
                        case "Debit Card":
                            kembalian = pembayaranBlanja.bayarEwallet(0, jumlahBayar, totalBelanja); 
                            break;
                        default:
                            kembalian = -1;
                    }

                    if (kembalian < 0) {
                        labelKembalian.setText("Kembalian: Uang tidak cukup atau metode tidak valid");
                    } else {
                        labelKembalian.setText("Kembalian: Rp " + kembalian);
                        riwayatTransaksi.add("Belanja: Rp " + totalBelanja + ", Bayar: Rp " + jumlahBayar + ", Metode: " + metode + ", Kembalian: Rp " + kembalian);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                  
                }
            }
        });

        itemRiwayatWindow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder riwayatText = new StringBuilder();
                for (String transaksi : riwayatTransaksi) {
                    riwayatText.append(transaksi).append("\n");
                }
                JOptionPane.showMessageDialog(frame, riwayatText.length() == 0 ? "Belum ada transaksi." : riwayatText.toString(), "Riwayat Transaksi", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        itemRiwayatWindow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame riwayatFrame = new JFrame("Riwayat Transaksi");
                riwayatFrame.setSize(400, 300);
                riwayatFrame.setLayout(new BorderLayout());

                JTextArea riwayatTextArea = new JTextArea();
                riwayatTextArea.setEditable(false);
                riwayatTextArea.setBackground(Color.BLUE);
                riwayatTextArea.setForeground(Color.WHITE);
                StringBuilder riwayatText = new StringBuilder();
                for (String transaksi : riwayatTransaksi) {
                    riwayatText.append(transaksi).append("\n");
                }
                riwayatTextArea.setText(riwayatText.toString());

                JScrollPane scrollPane = new JScrollPane(riwayatTextArea);
                riwayatFrame.add(scrollPane, BorderLayout.CENTER);

                riwayatFrame.setVisible(true);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PaymentGUI();
    }
}




