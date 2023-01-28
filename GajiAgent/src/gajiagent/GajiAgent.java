/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gajiagent;

import java.util.Scanner;   //Agar dapat menggunakan fungsi scanner

/**
 *
 * <h1> Gaji Agent </h1>
 * @author Asri Husnul Rosadi
 * @version 1.0
 * @since 28/1/2023
 * 
 */

public class GajiAgent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Kamus Data dan inisialisasi
        int gaji_pokok = 500000; //Gaji Pokok
        int harga_item = 50000; //Harga setiap item
        int total_gaji = 0, jumlah_item, total_penjualan, bonus, denda;
        
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan
        Scanner masukan = new Scanner(System.in);
        
        jumlah_item = masukan.nextInt(); //Membaca jumlah item yang dijual
        total_penjualan = jumlah_item * harga_item; //Total penjualan item yang dijual
        bonus = total_penjualan*10/100; //Bonus untuk setiap item
        denda = ((harga_item*15)- total_penjualan)*15/100; //Denda jika menjual dibawah 15 item
        
        //Percabangan untuk mengetahui total gaji berdasarkan jumlah item yang dijual
        if(jumlah_item < 15){
            total_gaji = gaji_pokok - denda;
        }
        if(jumlah_item >= 40){
            total_gaji = gaji_pokok + (total_penjualan * 25/100);
        }
        if(jumlah_item >= 80){
            total_gaji = gaji_pokok + (total_penjualan * 35/100);
        }
        if(jumlah_item >= 15 && jumlah_item < 40){
            total_gaji = gaji_pokok + bonus;
        }
        
        //Menampilkan output
        System.out.println(total_gaji);
    }
    
}
