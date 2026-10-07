package PRAKTIKUM;

import java.util.Scanner;
import java.util.Random;
public class CPMK12_CASE3_AURIRA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int angkaRahasia, tebakan, percobaan;
        String word;
         
         System.out.println("SELAMAT DATANG DI PERMAINAN TEBAK ANGKA");
         word = input.nextLine();
         
         System.out.println("OK! aku jelasin dulu ya aturan permainan ini, jadi di permainan ini kamu yang menebak angka dan aku yang memilih angka");
         word = input.nextLine();
         
         System.out.println("silahkan tebak angka dari 1-100, lalu masukkan angka yang kamu tebak. jangan sampai lebih dari 7 kali, ya!");
         angkaRahasia = random.nextInt(100) + 
                 
                 
                 1 ;
         percobaan = 0;
         
         while (percobaan < 7) {
             tebakan = input.nextInt();
             percobaan = percobaan + 1;
             
             if(tebakan < angkaRahasia) {
                 System.out.println("terlalu kecil");
                 } else {
                 if(tebakan > angkaRahasia){
                     System.out.println("terlalu besar");
                 } else {
                     System.out.println("benar");
                 }
             }
         } 
         System.out.println("maaf jawaban yang kamu berikan lebih dari 7 kali");
         
         input.close();
    }
}
