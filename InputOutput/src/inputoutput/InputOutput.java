/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inputoutput;

import java.util.Scanner;   //Agar dapat menggunakan fungsi scanner

/**
 *
 * <h1> Input & Output </h1>
 * @author Asri Husnul Rosadi
 * @version 1.0
 * @since 24/1/2023
 * 
 */

public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Kamus Data
        int kata;
        String s;
        
        //Scanner digunakan untuk melakukan masukan dari keyboard setelah program dijalankan
        Scanner masukan = new Scanner(System.in);
        
        //Perintah untuk memasukkan string kedalam variabel s
        s = masukan.nextLine(); //nextLine digunakan untuk String
        
        // Membuat array of string
        /*Split digunakan untuk mengambil suatu nilai yang terdapat didalam variable String, 
        nilai tersebut dapat kita ambil dengan menggunakan Regex lalu setelah itu akan 
        mengembalikan nilainya dengan nilai char array.*/
        String[] stringArray = s.split("[@ ? ! _ , . ']+");
        
        kata = stringArray.length; 
        
        //Menampilkan output
        System.out.println(kata); //Cetak jumlah kata
        
        for(int i = 0; i < kata; i++){
            System.out.println(stringArray[i]); 
        }
    }
    
}