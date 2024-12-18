/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoripbo;

/**
 *
 * @author firstiyantiputri
 */
import java.util.Scanner;

public class akses extends bangundatar {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        while (true) {
        System.out.println("Menu Perhitungan Luas dan Keliling Bangun Datar");
        System.out.println("Angka 1 untuk menghitung luas dan keliling Persegi");
        System.out.println("Angka 2 untuk menghitung luas dan keliling Persegi Panjang");
        System.out.println("Angka 3 untuk menghitung luas dan keliling Segitiga");
        System.out.println("Angka 4 untuk menghitung luas dan keliling Lingkaran");
        System.out.println("Angka 5 untuk keluar");
        System.out.println("Masukkan pilihan :");
        pilihan = input.nextInt();
        
        if (pilihan == 1) {
        persegi persegi = new persegi();
        System.out.println("Masukkan sisi: ");
        persegi.sisi = input.nextDouble();
        System.out.println("Luas persegi :" + persegi.hitungluas() + "\n" +
                           "Keliling persegi :" + persegi.hitungkeliling() + "\n" +
                           "Perhitungan Luas dan Keliling selesai.");
        }
        else if (pilihan == 2) {
            persegipanjang persegipanjang = new persegipanjang();
            System.out.println("Masukkan panjang: ");
            persegipanjang.panjang = input.nextDouble();
            System.out.println("Masukkan lebar: ");
            persegipanjang.lebar = input.nextDouble();
            System.out.println("Luas persegi panjang :" + persegipanjang.hitungluas() + "\n" +
                           "Keliling persegi panjang:" + persegipanjang.hitungkeliling() + "\n" +
                           "Perhitungan Luas dan Keliling selesai.");
        }
        else if (pilihan == 3) {
            segitiga segitiga = new segitiga();
            System.out.println("Masukkan alas:");
            segitiga.alas = input.nextDouble();
            System.out.println("Masukkan tinggi: ");
            segitiga.tinggi = input.nextDouble();
            System.out.println("Masukkan alas miring: ");
            segitiga.alasmiring = input.nextDouble();
            System.out.println("Luas segitiga :" + segitiga.hitungluas() + "\n" +
                               "Sisi Miring segitiga: " + segitiga.hitungsisimiring() + "\n" +
                               "Keliling segitiga:" + segitiga.hitungkeliling() + "\n" +
                               "Perhitungan Luas dan Keliling selesai.");    
        }
        else if (pilihan == 4) {
            lingkaran lingkaran = new lingkaran();
            System.out.println("Masukkan jejari : ");
            lingkaran.jejari = input.nextDouble();
            System.out.println("Masukkan diameter: ");
            lingkaran.diameter = input.nextDouble();
            System.out.println("Luas lingkaran :" + lingkaran.hitungluas() + "\n" +
                               "Keliling lingkaran:" + lingkaran.hitungkeliling() + "\n" +
                               "Perhitungan Luas dan Keliling selesai.");  
        }
        else if (pilihan == 5) {
            System.out.println("Keluar dari program");
            break;
        }
        else {
            System.out.println("Perintah tidak terdeteksi");
        }
       System.out.println (" ");
    }
} 
}

