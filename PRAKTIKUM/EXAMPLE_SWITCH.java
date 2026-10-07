/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRAKTIKUM;

/**
 *
 * @author gumga
 */
import java.util.Scanner;

public class EXAMPLE_SWITCH {

    public static void main(String[] args) {
        System.out.println("Masukkan pilihan hari: ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3: 
                System.out.println("wednesday");
                break;
            case 4: 
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
    }
    }
}