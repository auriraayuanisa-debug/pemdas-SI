package PRAKTIKUM;
import java.util.Scanner;

public class BilanganAURIRA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.println("Masukkan angka: ");
        int n = input.nextInt();
        System.out.println("bilangan 1 sampai " + n +"");
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "");
        }
        System.out.println();
        
        System.out.println("bilangan genap (angka 1 sampai " + n + ") ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
        System.out.println("bilangan ganjil (angka 1 sampai " + n + ") ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 !=0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
        
        input.close();
        
    }
}
