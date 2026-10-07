package PRAKTIKUM;
import java.util.Scanner;

public class MaxMinArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = {96, 56, 78, 53, 93};
        
        int max = nilai[0];
        int min = nilai[0];
        
        for (int i = 1; i < nilai.length; i++) {
        if (nilai[i] > max) {
            max = nilai[i];
        }
        if (nilai[i] < min) {
            min = nilai[i];
        }
    }
        System.out.println("Nilai terbesar = " + max);
        System.out.println("Nilai terkecil = " + min);
    }
}
