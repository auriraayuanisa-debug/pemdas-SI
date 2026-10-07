package PRAKTIKUM;
import java.util.Scanner;

public class SistemPresensi_AURIRA {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah total mahasiswa: ");
        int totalMahasiswa = input.nextInt();

        if (totalMahasiswa <= 0) {
            System.out.println("Jumlah mahasiswa tidak valid!");
            input.close();
            return;
        }

        int jumlahHadir = 0;
        int jumlahTidakHadir = 0;

        System.out.println("Masukkan data kehadiran (1 = Hadir, 0 = Tidak Hadir):");
        
        for (int i = 1; i <= totalMahasiswa; i++) {
            System.out.print("Mahasiswa ke-" + i + ": ");
            int status = input.nextInt();

            if (status == 1) {
                jumlahHadir++;
            } else if (status == 0) {
                jumlahTidakHadir++;
            } else {
                System.out.println("Input tidak valid! Masukkan angka 1 atau 0");
                i--;
            }
        }

        double persentaseKehadiran = (jumlahHadir / totalMahasiswa) * 100;

        System.out.println("----------------------------------------");
        System.out.println("PRESENSI MAHASISWA");
        System.out.println("----------------------------------------");
        System.out.println("Total Mahasiswa      : " + totalMahasiswa);
        System.out.println("Jumlah Hadir         : " + jumlahHadir);
        System.out.println("Jumlah Tidak Hadir   : " + jumlahTidakHadir);
        System.out.printf("Persentase Kehadiran : %.2f%%", persentaseKehadiran);

        if (persentaseKehadiran >= 75.0) {
            System.out.println("Status Keseluruhan   : **Memenuhi syarat** (>= 75%)");
        } else {
            System.out.println("Status Keseluruhan   : **Tidak memenuhi syarat** (< 75%)");
        }

        input.close();
    }
}
