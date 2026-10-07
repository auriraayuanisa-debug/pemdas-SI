/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRAKTIKUM;

/**
 *
 * @author gumga
 */
public class Example_AURIRA {

    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
        
        int z = 5;
        ++z;
        System.out.println(z);
        --z;
        System.out.println(z);
        
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x>= y);
        System.out.println(x <= y);
        
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        
        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));
    }
}
