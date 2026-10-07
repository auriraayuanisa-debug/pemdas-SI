package PRAKTIKUM;

import java.util.Scanner;

public class CASE2_parkir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String jenis;
        int jam;
        int biaya = 0;
        
        System.out.println("Masukkan jenis kendaraan (motor/mobil): ");
        jenis = input.nextLine();
        
        System.out.println("Masukkan lama parkir (jam): ");
        jam = input.nextInt();
        
        if (jenis.equalsIgnoreCase("MOTOR") || jenis.equalsIgnoreCase("MOBIL")) {
           if (jenis.equalsIgnoreCase("MOTOR") || jenis.equalsIgnoreCase("MOBIL")) {
               if (jenis.equalsIgnoreCase("MOTOR")) {
                   if (jam > 1) {
                       biaya = 2000 + ((jam - 1) * 1000);
                   } else {
                       biaya = 2000;
                   }
               } else {
                   if (jam > 1) {
                       biaya = 5000 + ((jam - 1) * 2000);
                   } else {
                       biaya = 5000;
                   }
               }
               System.out.println("Jenis Kendaraan Anda: " + jenis);
               System.out.println("Lama Parkir Anda(jam): " + jam);
               System.out.println("Total  biaya parkir Anda: " + biaya);
           } else {
               System.out.println("HARAP MASUKKAN JENIS DENGAN BENAR!");
               
               input.close();
           }
        }
    }
}