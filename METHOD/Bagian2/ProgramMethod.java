/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package METHOD.Bagian2;

/**
 *
 * @author gumga
 */
import java.util.Scanner;

public class ProgramMethod {
    public static int inputBaris(Scanner input) {
        System.out.print("Masukkan baris: ");
        return input.nextInt();
    }
    public static int inputKolom(Scanner input) {
        System.out.print("Masukkan kolom: ");
        return input.nextInt();
    }
    public static void cetakPersegiPanjang(int baris, int kolom) {
        System.out.println();
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
                                                                                    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris = inputBaris(input);
        int kolom = inputKolom(input);

        cetakPersegiPanjang(baris, kolom);

        input.close();
    }
}
