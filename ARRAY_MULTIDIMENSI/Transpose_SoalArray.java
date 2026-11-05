package ARRAY_MULTIDIMENSI;
public class Transpose_SoalArray {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matriks Awal:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Hasil Perhitungan Transpose:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriks[j][i] + " ");
            }
            System.out.println();
        }
    }
}