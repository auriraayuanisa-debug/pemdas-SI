/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRAKTIKUM;

/**
 *
 * @author gumga
 */
import java.util.Scanner;
public class EXAMPLE_CASE {
    
    public static void main(String[] args) {
        System.out.println("Masukkan nilai: ");
        Scanner input = new Scanner(System.in);
        
        double nilai = input.nextDouble();
        
        if(nilai > 100){
            System.out.println("NILAI TIDAK VALID");
            } else if(nilai >= 91){
                   System.out.println("grade A");
        } else if(nilai >= 86){
                System.out.println("grade A-");
            } else if(nilai >= 81) {
                    System.out.println("grade B+");
                } else if(nilai >= 76) {
                        System.out.println("grade B");
                    } else if(nilai >= 71) {
                            System.out.println("grade B-");
                        } else if(nilai >= 66) {
                                System.out.println("grade C+");
                            } else if(nilai >= 61) {
                                    System.out.println("grade C");
                                } else if(nilai >= 56) {
                                        System.out.println("grade D");
                                    } else if(nilai >= 0) {
                                             System.out.println("grade E");
                                         } else { 
                                        if(nilai < 0 || nilai > 100) {
                                            System.out.println("NILAI ANDA TIDAK VALID");
                                        }
                                         }
                                    }
                                }
