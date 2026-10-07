package PRAKTIKUM;
import java.util.Scanner;

public class FaktorialAURIRA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka;
        System.out.print("Masukkan angka: "); 
        angka = input.nextInt();
        int hasil = angka;
        
        System.out.print(angka +"! = ");
        for(int i = angka; i > 0; i--) {
            System.out.print(i);
            if(i > 1) {
                System.out.print(" x ");
            }
            if(angka != i) {
                hasil *= i;
            }
        }
        
        System.out.println("");
        System.out.println("hasil = " + hasil);
    }
}
    