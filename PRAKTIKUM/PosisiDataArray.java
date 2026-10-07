package PRAKTIKUM;
import java.util.Scanner;

public class PosisiDataArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = {96, 56, 78, 53, 93};
        
        int cari = 90;
        int posisi = -1;
        
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == cari) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Data ditemukan pada indeks " + posisi);
        } else {
            System.out.println("Data tidak ditemukan");
}
        }
    }

