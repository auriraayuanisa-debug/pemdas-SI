package PRAKTIKUM;
import java.util.Scanner;

public class ArrayFor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai = {96, 56, 78, 53, 93};
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]);
        }
    }
}
