package PRAKTIKUM;

import java.util.Scanner;

public class BAB3_PRAKTIKUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Total beras (kg): ");
        int totalBeras = input.nextInt();
        
        System.out.println("Beras per keluarga (kg): ");
        int berasPerKeluarga = input.nextInt();
        
        double jumlahKeluarga = totalBeras / berasPerKeluarga;
        double sisaBeras = totalBeras - berasPerKeluarga;
        
        System.out.println("====== HASIL DISTRIBUSI ======");
        System.out.println("Jumlah Keluarga = " + jumlahKeluarga);
        
        System.out.println("sisaBeras = " + sisaBeras + "kg");
        
        input.close();
    }
}