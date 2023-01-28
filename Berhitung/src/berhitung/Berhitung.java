/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package berhitung;

import java.util.Scanner;   //Agar dapat menggunakan fungsi scanner

/**
 *
 * <h1> Berhitung </h1>
 * @author Asri Husnul Rosadi
 * @version 1.0
 * @since 28/1/2023
 * 
 */

public class Berhitung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Kamus Data 
        int A;
        int B;
        int hasil = 0;
        char operator;
        
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan 
        Scanner masukan = new Scanner(System.in);
        A = masukan.nextInt();  //Untuk membaca data bertipe integer
        operator = masukan.next().charAt(0); //Untuk membaca data bertipe char
        B = masukan.nextInt();
        
        //Menggunakan switch case untuk mengecek operasi yang digunakan untuk perhitungan
        switch (operator) {
            case '+' -> hasil = A + B;
            case '-' -> hasil = A - B;
            case '*' -> hasil = A * B;
            case '/' -> hasil = A / B;
            case '%' -> hasil = A % B;
            default -> {
            }
        }
        
        //Menampilkan output
        System.out.println(hasil);
    }
    
}