/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputoutput2;

import java.util.Scanner;   //Agar dapat menggunakan fungsi scanner

/**
 *
 * <h1> Input & Output (2) </h1>
 * @author Asri Husnul Rosadi
 * @version 1.0
 * @since 28/1/2023
 * 
 */

public class InputOutput2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Kamus Data
        int angka;
        String kata;
        
        //Membuat array of string dan array of integer
        String[] arrayKata = new String[15];
        int[] arrayInt = new int[3];
        
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan
        Scanner masukan = new Scanner(System.in);
        
        //Melakukan perulangan untuk memasukkan nilai pada variabel kata dan angka ke array
        for(int i = 0; i < 3; i++){
            kata = masukan.next(); //next digunakan untuk membaca String namun hanya satu kata (sampai menemukan spasi)
            arrayKata[i] = kata;
            angka = masukan.nextInt(); //nextInt digunakan untuk membaca data tipe Integer
            arrayInt[i] = angka;
        }
        
        //Menampilkan Output
        System.out.println("==========================");
        for(int i = 0; i < 3; i++){
            System.out.printf("%-15s%03d%n", arrayKata[i], arrayInt[i]);
            /*
            %-15s artinya hanya dapat menampilkan 15 karakter (huruf) 
            %03d artinya menampilkan 3 buah bilangan integer diawali dengan nilai 0 jika kurang dari 3 bilangan
            */
        }
        System.out.println("==========================");
    }
}