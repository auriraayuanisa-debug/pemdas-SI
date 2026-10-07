package PRAKTIKUM;
import java.util.Scanner;

public class MenuProgram_AURIRA {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("===== MENU =====");
            System.out.println("Menampilkan angka 1-10");
            System.out.println("Menampilkan bilangan genap");
            System.out.println("Menghitung jumlah 1-10");
            System.out.println("Menggambar segitiga bintang");
            System.out.println("Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("--- Angka 1-10 ---");
                    for (int i = 1; i <= 10; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("--- Bilangan Genap (1-20) ---");
                    for (int i = 1; i <= 20; i++) {
                        if (i % 2 == 0) {
                            System.out.print(i + " ");
                        }
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("--- Menghitung Jumlah 1-10 ---");
                    int total = 0;
                    for (int i = 1; i <= 10; i++) {
                        total += i;
                    }
                    System.out.println("Jumlah total dari 1 sampai 10 adalah: " + total);
                    break;

                case 4:
                    System.out.println("--- Segitiga Bintang ---");
                    System.out.print("Masukkan tinggi segitiga: ");
                    int tinggi = input.nextInt();
                    
                    for (int i = 1; i <= tinggi; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan masukkan angka 1-5.");
                    break;
            }

        } while (pilihan != 5);

        input.close();
    }
}