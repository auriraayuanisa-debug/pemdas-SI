/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRAKTIKUM;

/**
 *
 * @author gumga
 */
public class NEW_AURIRA {

    public static void main(String[] args) {
        
        String jenis;
        int nasiAyam = 15000;
        int airMinum = 5000;
        int uangBayar = 50000;
        
        int totalMakanan = nasiAyam * 2;
        int totalMinuman = airMinum * 2;
        int total = totalMakanan + totalMinuman;
        int kembalian = uangBayar - total;
        
        System.out.println("=====STRUK BELANJA=====");
        System.out.println("nasi Ayam: Rp" + (nasiAyam* 2));
        System.out.println("air Minum: Rp" + (airMinum * 2) + (airMinum * 2));
        System.out.println("total bayar: Rp" + total);
        System.out.println("kembalian: Rp" + kembalian);
        
        String txt = "struk belanja Andi";
        System.out.println("The length of the txt string is: " + txt.length());
    }
}
