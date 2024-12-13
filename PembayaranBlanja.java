/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuliah.pbo.teori;

/**
 *
 * @author asus
 */
public class PembayaranBlanja implements MetodeBayarPakeAplikasi {
    double kembalian;
    double sisa;

    @Override
    public double bayarCash(double cash, double belanja) {
        kembalian = cash - belanja;
        return kembalian;
    }
    @Override
    public double bayarQris(int idUser , double saldo, double belanjaTotal) {
        sisa = saldo - belanjaTotal;
        return sisa;
    }
    @Override
    public double bayarEwallet(int idUser , double saldo, double belanjaTotal) {
        sisa = saldo - belanjaTotal;
        return sisa;
    }
    @Override
    public double bayarKreditCard(int idUser , double saldo, double belanjaTotal) {
        sisa = saldo - belanjaTotal;
        return sisa;
    }
    @Override
    public double bayarDebitCard(int idUser , double saldo, double belanjaTotal) {
        sisa = saldo - belanjaTotal;
        return sisa;
    }
    @Override
    public double bayarGopay(int idUser , double saldo, double belanjaTotal) {
        sisa = saldo - belanjaTotal;
        return sisa;
    }
    @Override
    public double bayarShopee(int idUser , double saldo, double belanjaTotal) {
        sisa = saldo - belanjaTotal;
        return sisa;
    }
}