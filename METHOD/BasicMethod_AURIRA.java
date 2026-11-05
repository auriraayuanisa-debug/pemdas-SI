package METHOD;


public class BasicMethod_AURIRA {
  
    static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("HASIL LUAS PERSEGI PANJANG");
        System.out.println("=========================");
        
        double luas = luasPersegiPanjang(5, 3);
        System.out.println("Luas: " + luas);
        
            }
} 
