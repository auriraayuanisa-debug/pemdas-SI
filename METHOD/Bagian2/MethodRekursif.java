/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package METHOD.Bagian2;

/**
 *
 * @author gumga
 */
public class MethodRekursif {
    public static void cetakBiner(int n) {
       if (n == 0) {
            System.out.print(0);
            return;
        }
        if (n > 0) {
            cetakBiner(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        int angka = 10;
        System.out.println("Representasi biner dari " + angka);
        System.out.println("jawabannya adalah: ");
        cetakBiner(angka);
        System.out.println();
    }
}