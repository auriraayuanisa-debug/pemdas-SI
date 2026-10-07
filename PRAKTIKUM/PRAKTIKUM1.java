package PRAKTIKUM;
import java.util.Scanner;

public class PRAKTIKUM1 {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        System.out.println("Masukkan Frekuensi wudhu: ");
        int frekuensiWudhu = input.nextInt();
        System.out.println("Masukkan total air: ");
        int airPerWudhu = input.nextInt();
        double totalAir = jumlahMahasiswa * frekuensiWudhu * airPerWudhu;
        double hemat = totalAir - (totalAir * 0.15);
        double totalAirHemat = totalAir - hemat;
        
        totalAirHemat = totalAir - hemat;
        System.out.println("======HASIL======");
        System.out.println("Total kebutuhan air: " + totalAir + " liter");
        System.out.println("air yang dihemat: " + totalAir + "liter");
        System.out.println("total kebutuhan air setelah penghematan 0.15 =" + totalAirHemat + "liter");
        input.close();
    }
    }
