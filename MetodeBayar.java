/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuliah.pbo.teori;

/**
 *
 * @author asus
 */
public interface MetodeBayar {
    double bayarCash(double cash, double belanja);
    double bayarQris(int idUser , double saldo, double belanjaTotal);
    double bayarEwallet(int idUser , double saldo, double belanjaTotal);
    double bayarKreditCard(int idUser , double saldo, double belanjaTotal);
    double bayarDebitCard(int idUser , double saldo, double belanjaTotal);
}