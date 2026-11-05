package ARRAY_MULTIDIMENSI;
public class JumlahElemenDiagonal_SoalArray {
    public static void main(String[] args) {
        int[][] matriks = {
            {5, 2, 8},
            {4, 7, 1},
            {9, 6, 3}
        };

        int n = matriks.length;
        int totalDiagonal = 0;

        for (int i = 0; i < n; i++) {
            totalDiagonal += matriks[i][i];
        }

        System.out.println("Matriks Persegi:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Jumlah elemen diagonal utama (5 + 7 + 3)= " + totalDiagonal);
    }
}