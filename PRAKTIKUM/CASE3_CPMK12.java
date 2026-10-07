package PRAKTIKUM;

import java.util.*;

public class CASE3_CPMK12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int angkaRahasia = random.nextInt(100) + 1;
        int maxTebakan = 7;
        int percobaan = 1;
        boolean menang = false;
        
        System.out.println("===SELAMAT DATANG DI PERMAINAN TEBAKAN===");
        System.out.println("Kamu memiliki " + maxTebakan + " kesempatanmu menebak angka dari 1 dan 100. Semoga tebakanmu benar!");
        
        while (percobaan <= maxTebakan) {
            System.out.print("Masukkan angka tebakanmu (Ini Percobaan " + percobaan + "): ");
            
            int tebakan = input.nextInt();
            if (tebakan < 1 || tebakan > 100) {
                System.out.println("angka harus antara 1 dan 100 yaa teman-teman. Coba lagi okaay!.");
                continue;
            }
            
            if (tebakan == angkaRahasia) {
                menang = true;
                break;
            } else if (tebakan < angkaRahasia) {
                System.out.println("Angka tebakanmu terlalu rendah.");
            } else {
                System.out.println("angka tebakanmu terlalu tinggi.");
            }

            percobaan++;
        }
        
            if (menang) {
            System.out.println("SELAMAT! Kamu berhasil menebak angka yang benar, YEAAAY");
            } else {
            System.out.println("Maaf, kamu kehabisan kesempatan. Angka yang benar adalah: " + angkaRahasia);
        }
            input.close();
    }
        
}
