/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoripbo;

/**
 *
 * @author firstiyantiputri
 */
public class segitiga extends bangundatar{
    double alas;
    double tinggi;
    double alasmiring;
    @Override
    double hitungluas() {
        luas = 0.5 * alas * tinggi;
        return luas;
    }
    double hitungsisimiring() {
        alasmiring = Math.sqrt (alas *alas) + (tinggi * tinggi);
        return alasmiring;
    }
    double hitungkeliling() {
        keliling = alas + tinggi + alasmiring;
        return keliling;
    }
    
}
