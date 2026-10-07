package PRAKTIKUM;
import java.util.Scanner;
public class Bab1 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Jumlah mahasiswa: ");
       int jumlahMahasiswa = input.nextInt();
       System.out.println("Frekuensi wudhu: ");
       int frekuensiWudhu = input.nextInt();
       System.out.println("airPerWudhu: ");
       double airPerWudhu = input.nextDouble();
       double totalAir = jumlahMahasiswa*frekuensiWudhu*airPerWudhu;
       double hemat = totalAir - (totalAir*0.15);
       double totalAirHemat = totalAir - hemat;
       System.out.println("======HASIL======");
       System.out.println("total kebutuhan air = " + totalAir + "liter");
       System.out.println("total kebutuhan air setelah penghematan 0.15 = " + totalAirHemat + "liter");
       
    }
}