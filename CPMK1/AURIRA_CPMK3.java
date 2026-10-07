package CPMK1;
import java.util.Scanner;

public class AURIRA_CPMK3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        
        System.out.println("Hasil Penjumlahan = " + (a + b));
        System.out.println("Hasil Pengurangan = " + (a - b));
        System.out.println("Hasil Perkalian = " + (a * b));
        System.out.println("Hasil Pembagian = " + (a / b));
        
        input.close();
    }
}
