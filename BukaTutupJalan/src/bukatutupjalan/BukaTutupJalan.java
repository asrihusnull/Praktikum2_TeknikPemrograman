/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bukatutupjalan;

import java.util.Scanner;   //Agar dapat menggunakan fungsi scanner

/**
 *
 * <h1> Buka Tutup Jalan </h1>
 * @author Asri Husnul Rosadi
 * @version 1.0
 * @since 28/1/2023
 * 
 */

public class BukaTutupJalan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Kamus Data
        String plat1, plat2, plat3, plat4, platGabungan;
        long hasil;
        
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan
        Scanner masukan = new Scanner(System.in);
        
        //Perintah untuk memasukkan dan membaca masukkan berupa string
        plat1 = masukan.next();
        plat2 = masukan.next();
        plat3 = masukan.next();
        plat4 = masukan.next();
        
        //Perhitungan untuk menentukan status keadaan mobil
        platGabungan = plat1 + plat2 + plat3 + plat4;
        hasil = Long.parseLong(platGabungan) - 999999;
        hasil = hasil % 5;
        
        //Menampilkan output
        if (hasil == 0) {
            System.out.println("jalan");
        } else {
            System.out.println("berhenti");
        }
    }
}