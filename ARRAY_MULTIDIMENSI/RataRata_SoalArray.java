package ARRAY_MULTIDIMENSI;

public class RataRata_SoalArray {
    public static void main(String[] args) {
        
        double[][] nilai = {
            {80, 75, 90, 85},
            {70, 85, 88, 92},
            {95, 90, 85, 80}
        };

        System.out.println("=== Rata-Rata Nilai Mahasiswa ===");
        for (int i = 0; i < nilai.length; i++) {
            double total = 0;
            for (int j = 0; j < nilai[i].length; j++) {
                total += nilai[i][j];
            }
            double rataRata = total / nilai[i].length;
            System.out.printf("Rata-rata Nilai Mahasiswa ke- : ", (i + 1), rataRata);
        }
    }
}