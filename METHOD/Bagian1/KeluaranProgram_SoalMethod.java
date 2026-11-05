package METHOD.Bagian1;

public class KeluaranProgram_SoalMethod {
    static int x = 5;
    static void ubah(int x) {
        x = x + 10;
        System.out.println("A: " + x);
}
public static void main(String[] args) {
    int y = 3;
    ubah(y);
    ubah(x);
    System.out.println("B: " + x + " " + y);
    }
}
//A: 13
//A: 15
//B: 5 3