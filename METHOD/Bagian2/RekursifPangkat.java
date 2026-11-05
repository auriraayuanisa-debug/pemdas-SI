package METHOD.Bagian2;
public class RekursifPangkat {
    public static int pangkat(int basis, int eksponen) {
        if (eksponen == 0) {
            return 1;
        }
        else {
            return basis * pangkat(basis, eksponen - 1);
        }
    }

    public static void main(String[] args) {
        int basis = 2;
        int eksponen = 4;
        
        int hasil = pangkat(basis, eksponen);
        System.out.println(basis + " pangkat " + eksponen + " = " + hasil);
    }
}