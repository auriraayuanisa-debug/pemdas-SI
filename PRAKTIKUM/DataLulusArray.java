package PRAKTIKUM;
import java.util.Scanner;

public class DataLulusArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = {96, 56, 78, 53, 93};
        
        int jumlahLulus = 0;
        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] >= 75) {
                jumlahLulus++;
            }
        }
        
        System.out.println("Jumlah Mahasiswa Yang Lulus = " + jumlahLulus);

    }
}
