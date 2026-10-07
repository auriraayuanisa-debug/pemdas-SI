package PRAKTIKUM;
import java.util.Scanner;

public class NestedLoop_PEMDAS{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, angka;

        i = 4;
        System.out.println("Masukkan angka perkalian: ");
        angka = input.nextInt();
        while (i < 10) {
            System.out.println(Integer.toString(angka) + "x" + i + "=" + i * angka);
            i = i + 1;
        }
    }
}
