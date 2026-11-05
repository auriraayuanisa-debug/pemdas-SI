package ARRAY_MULTIDIMENSI;
public class NilaiTerbesarDanPosisi_SoalArray {
    public static void main(String[] args) {
        int[][] matriks = {
            {15, 45, 23},
            {89, 34, 67},
            {56, 78, 16}
        };

        int nilaiMax = matriks[0][0];
        int Baris = 0;
        int Kolom = 0;

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (matriks[i][j] > nilaiMax) {
                    nilaiMax = matriks[i][j];
                    Baris = i;
                    Kolom = j;
                }
            }
        }

        System.out.println("Nilai terbesar: " + nilaiMax);
        System.out.println("Posisi: Baris ke-" + Baris + ", Kolom ke-" + Kolom);
        System.out.println("Matriks: " + "[" + Baris + "][" + Kolom + "]");
    }
}