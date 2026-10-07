package CPMK1;

import java.util.*;
import java.lang.Math;

public class CPMK3_A {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b;
        String kode;

        System.out.println("Masukkan angka pertama: ");
        a = input.nextInt();
        System.out.println("Masukkan angka kedua: ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("X untuk menghitung penjumlahan");
        System.out.println("Y untuk menghitung pengurangan");
        System.out.println("Z untuk menghitung perkalian");
        System.out.println("W untuk menghitung pembagian");
        kode = input.nextLine();
        if (kode.equals("X")) {
            System.out.println("hasil penjumlahan = " + (a + b));
        } else {
            if (kode.equals("Y")) {
                System.out.println("hasil pengurangan =" + (a - b));
            } else {
                if (kode.equals("Z")) {
                    System.out.println("hasil perkalian =" + (a * b));
                } else {
                    if (kode.equals("W")) {
                        System.out.println("hasil pembagian =" + (a / b));
                    }
                }
            }
        }
    }
}

