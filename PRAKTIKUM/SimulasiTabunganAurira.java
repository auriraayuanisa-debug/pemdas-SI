package PRAKTIKUM;
import java.util.Scanner;

public class SimulasiTabunganAurira {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = input.nextInt();
        System.out.println();

        int tabunganBulanan = 100000;
        int kenaikan = 50000;        
        int totalTabungan = 0;
        int bulanTarget = 0;

        for (int i = 1; i <= jumlahBulan; i++) {
            if (i > 1) {
                tabunganBulanan += kenaikan;
            }
            
            totalTabungan += tabunganBulanan;
            System.out.println("Bulan ke-" + i + " : Rp" + tabunganBulanan);

            if (totalTabungan >= 1000000 && bulanTarget == 0) {
                bulanTarget = i;
                
                break; 
            }
        }

        System.out.println("====================");
        System.out.println("Total tabungan akhir : Rp" + totalTabungan);
        
        if (bulanTarget > 0) {
            System.out.println("Target Rp1.000.000 pertama kali tercapai pada: **Bulan ke-" + bulanTarget + "**");
        } else {
            System.out.println("Dalam " + jumlahBulan + " bulan, total tabungan belum mencapai Rp1.000.000.");
        }

        input.close();
    }
}