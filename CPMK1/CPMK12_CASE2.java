package CPMK1;

import java.util.Scanner;
public class CPMK12_CASE2 {

    public static void main(String[] args) {
        int motor, mobil, parkir;
        
        Scanner input = new Scanner(System.in);
        motor = input.nextInt(8);
        mobil = input.nextInt(3);
        parkir = motor * 2000 + mobil * 5000;
        
        System.out.println(parkir);
        input.close();
    }
}
