/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bignumber;

import java.util.Scanner;   //Agar dapat menggunakan fungsi scanner
import java.math.BigInteger;  //Untuk mewakili angka besar yang tidak menentu

/**
 *
 * <h1> Big Number </h1>
 * @author Asri Husnul Rosadi
 * @version 1.0
 * @since 28/1/2023
 * 
 */

public class BigNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Kamus Data
        BigInteger a, b, hasil_tambah, hasil_kali;
        
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan
        Scanner masukan = new Scanner(System.in);
        
        //Perintah untuk memasukkan dan membaca masukkan berupa big integer
        a = masukan.nextBigInteger();
        b = masukan.nextBigInteger();
        
        //Melakukan proses perhitungan 
        hasil_tambah = a.add(b); //Untuk melakukan pertambahan
        hasil_kali = a.multiply(b); //Untuk melakukan perkalian
        
        //Menampilkan output
        System.out.println(hasil_tambah);
        System.out.println(hasil_kali);
    }
    
}