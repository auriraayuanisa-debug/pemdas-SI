package METHOD.Bagian2;
public class RataRataTipeDouble_SoalMethod {
    public static double rataRataTipe(double a, double b) {
        return (a + b) / 2;
    }    
    
    public static double rataRataTipe(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    
    public static void main(String[] args) {

        double hasil1 = rataRataTipe(87, 92);
        double hasil2 = rataRataTipe(79, 98, 97);

        System.out.println("Rata-rata dua bilangan: " + hasil1);
        System.out.println("Rata-rata tiga bilangan: " + hasil2);
    }
}
