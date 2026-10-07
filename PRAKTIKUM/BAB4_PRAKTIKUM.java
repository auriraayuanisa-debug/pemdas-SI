package PRAKTIKUM;

import java.util.Scanner;
public class BAB4_PRAKTIKUM {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        int tanggungan;
        double ipk, penghasilan;
        boolean aktifSosial, beasiswaLain;

        System.out.println("Masukkan ipk: ");
        ipk = input.nextDouble();
        
        System.out.println("Masukkan penghasilan: ");
        penghasilan = input.nextDouble();
        
        System.out.println("Masukkan tanggungan: ");
        tanggungan = input.nextInt();
        
        System.out.println("Masukkan aktif sosial: ");
        aktifSosial = input.nextBoolean();
       
        System.out.println("Masukkan beasiswa lain: ");
        beasiswaLain = input.nextBoolean();
        if (beasiswaLain == true) {
            System.out.println("tidak berhak (beasiswa ganda)");
        } else {
            if (ipk >= 3.5 && penghasilan <= 3000000 && tanggungan >= 3) {
                System.out.println("prioritas utama");
            } else {
                if (ipk >= 3.0 && penghasilan <= 5000000) {
                    System.out.println("prioritas kedua: ");
                } else {
                    if (aktifSosial == true && ipk >= 3.0) {
                        System.out.println("pertimbangan khusus");
                    } else {
                        System.out.println("belum memenuhi prioritas");
                    }
                }
            }
        }
    }
}
