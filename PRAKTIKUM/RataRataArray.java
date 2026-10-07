package PRAKTIKUM;
import java.util.Scanner;

public class RataRataArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] nilai = {96, 56, 78, 53, 93};
        int total = 0;
        
        for (int i = 0; i < nilai.length; i++) {
        total += nilai[i];
        }
        
        double rataRata = (double) total / nilai.length;
        
        System.out.println("Total = " + total);
        System.out.println("Rata-rata = " + rataRata);
    }
}
