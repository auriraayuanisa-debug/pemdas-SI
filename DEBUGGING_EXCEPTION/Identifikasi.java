/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBUGGING_EXCEPTION;
   
/**
 *
 * @author gumga
 */
 import java.util.Scanner;
public class Identifikasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai 1: ");
        int nilai1 = input.nextInt();
        
        System.out.print("Masukkan nilai 2: ");
        int nilai2 = input.nextInt();
        System.out.print("Masukkan nilai 3: ");
        int nilai3 = input.nextInt();

        int rataRata = nilai1 + nilai2 + nilai3 / 3;
        if (rataRata > 75) {
        System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }
        System.out.println("Rata-rata: " + rataRata);
        input.close();
    }
}