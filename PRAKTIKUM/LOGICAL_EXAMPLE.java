package PRAKTIKUM;
import java.util.Scanner;

public class LOGICAL_EXAMPLE {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilih = 2;
        int a, b;
        
        System.out.println("hai Andi, hari ini Andi ingin belajar apa? masukkan sesuai pilihan berikut!");
        System.out.println("pilih 1: belajar penjumlahan");
        System.out.println("pilih 2: belajar pengurangan");  
        System.out.println("pilih 3: belajar pembagian");
        System.out.println("Masukkan pilihanmu: ");
        pilih = input.nextInt();
        if (pilih == 1) {
            System.out.println("Andi memilih belajar penjumlahan");
            System.out.println("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.println("Masukkan angka kedua: ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Hasil pertambahan = " + (a + b));
        
        } else {
            if (pilih == 2) {
            System.out.println("Andi memilih belajar pengurangan");
            System.out.println("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.println("Masukkan angka kedua: ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Hasil pengurangan = " + (a - b));
        
        } else {
           if (pilih == 3) {
            System.out.println("Andi memilih belajar pembagian");
            System.out.println("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.println("Masukkan angka kedua: ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Hasil pembagian = " + (a / b));
        
        } else {
        System.out.println("Andi memilih belajar perkalian");
        System.out.println("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.println("Masukkan angka kedua: ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Hasil perkalian = " + (a * b));
        
        
        }
           }    
            }
            System.out.println("Selamat belajar dan selamat mengerjakan, Andi!");
        }
    }
