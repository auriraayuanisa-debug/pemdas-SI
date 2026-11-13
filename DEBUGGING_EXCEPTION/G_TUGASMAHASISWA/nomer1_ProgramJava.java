/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBUGGING_EXCEPTION.G_TUGASMAHASISWA;
import java.util.Scanner;
/**
 *
 * @author gumga
 */
public class nomer1_ProgramJava {
    public static double hitungRataRata(double total, int jumlah) {
       return total * jumlah; 
    }
    public static int hitungBagi(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== ANALISIS NILAI ====");

        System.out.print("Masukkan Total Nilai: ");
        double total = input.nextDouble();

        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlah = input.nextInt();

        double rataRata = hitungRataRata(total, jumlah);
        System.out.println("Hasil Rata-rata: " + rataRata);
        
        System.out.print("Masukkan Angka Pembagi: ");
        
        int pembagi = input.nextInt();
        int hasilBagi = hitungBagi((int) total, pembagi);
        System.out.println("Hasil Pembagian: " + hasilBagi);
        
        input.close();
    }
}