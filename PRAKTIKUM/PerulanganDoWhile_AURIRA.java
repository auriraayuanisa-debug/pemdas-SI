package PRAKTIKUM;

import java.util.Scanner;
public class PerulanganDoWhile_AURIRA {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka (masukkan angka 0 untuk berhenti): ");
            angka = input.nextInt();
        } while (angka != 0);
        System.out.println("Anda memasukkan: " + angka);
        System.out.println("PROGRAM SELESAI.");
        
        input.close();
    }
}
