package METHOD.Bagian1;

import java.util.Scanner;
public class KonversiSuhu_SoalMethod {
    public static double CelsiusKeFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static double FahrenheitKeCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Celsius -> Fahrenheit. Fahrenheit -> Celsius");
        System.out.print("Pilih menu 1 atau 2: ");
        int pilih = input.nextInt();

        if (pilih == 1) {
            System.out.print("Masukkan Celsius: ");
            double c = input.nextDouble();
            System.out.println("Hasil: " + CelsiusKeFahrenheit(c) + " °F");
        } else if (pilih == 2) {
            System.out.print("Masukkan Fahrenheit: ");
            double f = input.nextDouble();
            System.out.println("Hasil: " + FahrenheitKeCelsius(f) + " °C");
        }
    }
}