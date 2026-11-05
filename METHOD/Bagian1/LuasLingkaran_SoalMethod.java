package METHOD.Bagian1;

import java.util.Scanner;
public class LuasLingkaran_SoalMethod {
    public static double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("Masukkan jari-jari lingkaran ke-" + i + ": ");
            double r = input.nextDouble();

            double luas = luasLingkaran(r);
            System.out.println("Luas lingkaran dengan r =  " + r + "    adalah: " + luas);
        }

        input.close();
    }
}