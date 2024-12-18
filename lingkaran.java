/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoripbo;

/**
 *
 * @author firstiyantiputri
 */
public class lingkaran extends bangundatar {
    double jejari;
    double diameter;
    @Override
    double hitungluas() {
        luas = 2 * Math.PI * jejari;
        return luas;
    }
    @Override
    double hitungkeliling() {
        keliling = Math.PI * diameter;
        return keliling;
    }
}
