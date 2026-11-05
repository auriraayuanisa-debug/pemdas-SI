/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package METHOD.Bagian2;

/**
 *
 * @author gumga
 */
public class MenentukanNilai {
    public static int misteri(int n) {
        if (n == 0) {
            return 0;
        }
        return n + misteri(n - 1);
    }

    public static void main(String[] args) {
        int angka = 4;
        int hasil = misteri(angka);
        
        System.out.println("Hasil dari pemanggilan misteri(" + angka + ") adalah: " + hasil);
    }
}

//menjumlahkan nilai n dengan hasil pemanggilan fungsi misteri(n - 1) secara berulang hingga mencapai kondisi basis n == 0.