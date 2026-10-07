package PRAKTIKUM;
import java. util.Scanner;

public class PersegiPanjang {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan baris: ");
        int baris = input.nextInt();
        
        System.out.println("Masukkan kolom");
        int kolom = input.nextInt();

        System.out.println();
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
        input.close();
    }
}
