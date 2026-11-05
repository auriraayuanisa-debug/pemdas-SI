/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package METHOD.Bagian2;

/**
 *
 * @author gumga
 */
public class PerulanganJumlahDeret {
    public static int jumlahDeretRekursif(int n) {
        if (n <= 1) return n;
        return n + jumlahDeretRekursif(n - 1);
    }

    public static int jumlahDeretIteratif(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }
}
