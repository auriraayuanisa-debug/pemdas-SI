/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DEBUGGING_EXCEPTION.G_TUGASMAHASISWA;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author gumga
 */
public class codeExceptionHandling {
    public static double hitungRataRata(double total, int jumlah) throws ArithmeticException {
        
        if (jumlah <= 0) {
            throw new ArithmeticException("Jumlah mata kuliah harus lebih besar dari 0.");
        }
        return total / jumlah; 
    }

    public static double hitungBagi(double a, double b) throws ArithmeticException {
        
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan angka nol tidak diperbolehkan.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== ANALISIS NILAI ====");

        try {
            System.out.println("Masukkan Total Nilai: ");
            double total = input.nextDouble();

            System.out.println("Masukkan Jumlah Mata Kuliah: ");
            int jumlah = input.nextInt();

            double rataRata = hitungRataRata(total, jumlah);
            System.out.println(String.format("Hasil Rata-rata: %.2f", rataRata));

            System.out.println("Masukkan Angka Pembagi: ");
            double pembagi = input.nextDouble();

            double hasilBagi = hitungBagi(total, pembagi);
            System.out.println(String.format("Hasil Pembagian: %.2f", hasilBagi));

        } catch (InputMismatchException e) {
            System.out.println("[ERROR INPUT]: Input yang Anda masukkan harus berupa angka!");
            
        } catch (ArithmeticException e) {
            System.out.println("[ERROR ARITMATIKA]: " + e.getMessage());
            
        } catch (Exception e) {
            System.out.println("[ERROR TERJADI]: " + e.getMessage());
            
        } finally {
            input.close();
            System.out.println("=================================");
        }
    }
}
