/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoripbo;

/**
 *
 * @author firstiyantiputri
 */
public class persegipanjang extends bangundatar {
    double panjang;
    double lebar;
    double luas;
    double keliling;
    @Override
    double hitungluas() {
        luas = panjang * lebar;
        return luas;
    }
    @Override
    double hitungkeliling() {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }
}
