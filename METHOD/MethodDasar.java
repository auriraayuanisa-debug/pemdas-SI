package METHOD; 

public class MethodDasar {
    static int luasPersegiPanjang(int panjang, int lebar) {
        return panjang * lebar;
    }
    static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    static double luasSegitiga(double panjang, double lebar) {
        return 0.5*panjang * lebar;
    }
    static void cetakHasil(String namaBangun, double hasil) {
        System.out.println("Luas" + namaBangun +hasil);
    }
    
    public static void main(String[] args) {
        System.out.println("=========================");
        System.out.println("HASIL LUAS BANGUN");
        System.out.println("=========================");
        
        double luas;
        double luasPersegiPanjang = luasPersegiPanjang(5, 3);
        double luasSegitiga = luasSegitiga(6.7, 8);
        System.out.println("Luas segitiga: " + luasSegitiga);
        System.out.println("Luas persegi panjang: " + luasPersegiPanjang);
    }   
}