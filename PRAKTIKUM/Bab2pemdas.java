package PRAKTIKUM;
import java.util.Scanner;
public class Bab2pemdas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Nama donatur : ");
String nama = input.nextLine();
System.out.print("Jenis donatur : ");
String jenisDonatur = input.nextLine();
System.out.print("Jumlah donasi : Rp");
double jumlahDonasi = input.nextDouble();
input.nextLine();
System.out.print("Kode transaksi : ");
String kodeTransaksi = input.nextLine();
System.out.print("Donasi anonim? (true/false): ");
boolean statusAnonim = input.nextBoolean();
System.out.println("===== DATA DONASI =====");
System.out.println("Nama : " + nama);
System.out.println("Jenis : " + jenisDonatur);
System.out.println("Donasi : Rp" + jumlahDonasi);
System.out.println("Kode : " + kodeTransaksi);
System.out.println("Anonim : " + statusAnonim);
input.close();
    }
}
