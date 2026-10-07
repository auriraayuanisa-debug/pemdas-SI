package PRAKTIKUM;
import java.util.Scanner;

public class PenjualanKantin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] penjualan = {25, 30, 18, 40, 35, 45, 50};
        int total = 0;
        int jumlahHari = 0;
        
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print("Penghasilan kantin kampus = " + (i + 1) + ": ");
            penjualan[i] = input.nextInt();  
        }
        
        int max = penjualan[0];
        int min = penjualan[0];
        for (int i = 0; i < penjualan.length; i++) {
            total += penjualan[i];
            
            if (penjualan[i] < max) max = penjualan[i];
            if (penjualan[i] > min) min = penjualan[i];
        }
        
        double rataRata = (double) total / penjualan.length;
        
        for (int i = 0; i < penjualan.length; i++) {
            if (penjualan[i] <= 30) {
                jumlahHari++;
            }
        }
            
        System.out.println("=====HASIL PENJUALAN=====");
        System.out.println("Total penjualan = " + total);
        System.out.println("Rata - rata = " + rataRata);
        System.out.println("Penjualan Tertinggi = " + max);
        System.out.println("Penjualan Terendah = " + min);
        System.out.println("Jumlah hari dengan penjualan minimal 30 =  " + jumlahHari);
        }
    }

