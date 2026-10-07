package PRAKTIKUM;
import java.util.Scanner;

public class TabelPerkalian_AURIRA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan angka: ");
        int angka = input.nextInt();
        
        System.out.println("===TABEL PERKALIAN " + angka + " ===");
        
        for (int i = 1; i <= 10; i++) {
            int hasil = angka * i;
            System.out.println(angka + " x " + i + " = " + hasil);
        }
        
        input.close();
    }
    
}
