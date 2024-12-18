/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoripbo;

/**
 *
 * @author firstiyantiputri
 */


public class persegi extends bangundatar{
    double sisi;
    double luas;
    double keliling;
    
    @Override
    double hitungluas() {
        luas = sisi * sisi;
        return luas;
    }
    @Override
    double hitungkeliling() {
        keliling = 4 * sisi;
        return keliling;
    }
}
