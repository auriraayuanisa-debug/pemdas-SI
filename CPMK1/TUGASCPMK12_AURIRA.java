package CPMK1;
import java.util.Scanner;

public class TUGASCPMK12_AURIRA {

   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Masukkan total Harta :   ");
       double harta = input.nextDouble();
       
       System.out.println("Masukkan nilai nisab :   ");
       double nisab = input.nextDouble();
       
       if (harta >= nisab) {
           double zakat = harta * 0.025;
           
        System.out.println("Harta mencapai nisab.");
        System.out.println("Zakat yang harus dibayar:   Rp  "+ zakat);
       } else {
           System.out.println("Harta belum mencapai nisab   :   ");
       }  
       input.close();
   }
}