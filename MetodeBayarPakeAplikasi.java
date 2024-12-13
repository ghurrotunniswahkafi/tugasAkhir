/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuliah.pbo.teori;

/**
 *
 * @author asus
 */
public interface MetodeBayarPakeAplikasi extends MetodeBayar {
    double bayarGopay(int idUser , double saldo, double belanjaTotal);
    double bayarShopee(int idUser , double saldo, double belanjaTotal);
}


