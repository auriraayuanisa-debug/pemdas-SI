package ARRAY_MULTIDIMENSI;

import java.util.Scanner;

public class PengembanganArrayMultidimensi {
     
    static int inputUkuran(Scanner input, String keterangan) {
        int ukuran;

        do {
            System.out.print(keterangan);
            ukuran = input.nextInt();

            if (ukuran <= 0) {
                System.out.println("ukurannya harus lebih dari 0!");
            }
        } while (ukuran <= 0);

        return ukuran;
    }

    static void inputData(
        Scanner input,
        String[][][] mahasiswa,
        String[] prodi
    ) {
        input.nextLine(); 

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Prodi: " + prodi[i]);

            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.println("Kelas " + (char)('A' + j));

                for (int k = 0; k < mahasiswa[i][j].length; k++) {
                    System.out.print(
                        "Nama mahasiswa ke-" + (k + 1) + ": "
                    );

                    mahasiswa[i][j][k] = input.nextLine().trim();
                }
            }
        }
    }

    static void tampilkanData(
        String[][][] mahasiswa,
        String[] prodi
    ) {
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("\nProdi: " + prodi[i]);

            System.out.printf("%-10s", "Kelas");

            for (int k = 0; k < mahasiswa[i][0].length; k++) {
                System.out.printf("| %-18s", "Mahasiswa " + (k + 1));
            }

            System.out.println();

            for (int j = 0; j < mahasiswa[i].length; j++) {
                System.out.printf("%-10s", "Kelas " + (char)('A' + j));

                for (int k = 0; k < mahasiswa[i][j].length; k++) {
                    System.out.printf("| %-18s", mahasiswa[i][j][k]);
                }

                System.out.println();
            }
        }
    }

    static void operasiString(
        Scanner input,
        String[][][] mahasiswa,
        String[] prodi
    ) {
        System.out.println("=== OPERASI STRING ===");

        System.out.print("Masukkan nama untuk dicari: ");
        String cari = input.nextLine().trim();

        boolean ditemukan = false;

        for (int i = 0; i < mahasiswa.length; i++) {
            for (int j = 0; j < mahasiswa[i].length; j++) {
                for (int k = 0; k < mahasiswa[i][j].length; k++) {

                    String nama = mahasiswa[i][j][k];

                    String namaKapital = nama.toUpperCase();

                    if (nama.equalsIgnoreCase(cari)) {
                        System.out.println("Data Mahasiswa ditemukan!");
                        System.out.println("Nama       : " + nama);
                        System.out.println("Nama kapital: " + namaKapital);
                        System.out.println("Prodi      : " + prodi[i]);
                        System.out.println("Kelas      : " + (char)('A' + j));
                        ditemukan = true;
                    }
                }
            }
        }

        if (!ditemukan) {
            System.out.println("Nama mahasiswa tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===========================");
        System.out.println("    DATA MAHASISWA FST     ");
        System.out.println("===========================");

        int programStudi = inputUkuran(
            input, "Jumlah program studi: "
        );

        int jumlahKelas = inputUkuran(
            input, "jumlah kelas: "
        );

        int jumlahMahasiswa = inputUkuran(
            input, "Jumlah mahasiswa: "
        );

        String[][][] mahasiswa = new String
            [programStudi][jumlahKelas][jumlahMahasiswa];

        String[] prodi = new String[programStudi];

        input.nextLine();
        
        System.out.println("=========================");
        System.out.println("      MASUKKAN DATA      ");
        System.out.println("=========================");

        for (int i = 0; i < programStudi; i++) {
            System.out.print("Nama prodi ke-" + (i + 1) + ": ");
            prodi[i] = input.nextLine().trim();
        }

        inputData(input, mahasiswa, prodi);
        tampilkanData(mahasiswa, prodi);
        operasiString(input, mahasiswa, prodi);
        
        input.close();
    }
}
