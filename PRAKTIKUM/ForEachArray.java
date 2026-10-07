package PRAKTIKUM;
import java.util.Scanner;

public class ForEachArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nilai  = {96, 56, 78, 53, 93};
        
        for (int n : nilai) {
            System.out.println(n);
        }

    }
}
