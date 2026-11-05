package METHOD.Bagian1;

public class BilanganPrima_SoalMethod {
    public static boolean Prima(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Bilangan prima 1-100:");
        for (int i = 1; i <= 100; i++) {
            if (Prima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}