package PRAKTIKUM;
import java.util.Scanner;

public class NilaiMahasiswa_AURIRA {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        double totalNilai = 0;
        int totalMahasiswa = 5;

        for (int i = 1; i <= totalMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            int nilai = input.nextInt();
            totalNilai += nilai;

            if (nilai >= 75) {
                System.out.println("Status: Lulus");
                jumlahLulus++;
            } else {
                System.out.println("Status: Tidak Lulus");
                jumlahTidakLulus++;
            }
            System.out.println("-----------------------------------");
        }

        double rataRata = totalNilai / totalMahasiswa;
        
        System.out.println("====rekap keseluruhan nilai mahasiswa====");
        System.out.println("Jumlah mahasiswa lulus       : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + jumlahTidakLulus);
        System.out.println("Rata-rata nilai kelas        : " + rataRata);

        input.close();
}
    }