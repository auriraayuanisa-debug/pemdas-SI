package METHOD;
public class LatihanArrayMultidimensi {
    public static void main(String[] args) {
        String[][][] arr = new String[3][3][5];
        
        String[][][] dataMahasiswa = {
            {
                {"Zalief", "Yanto", "Rasyid", "Aira", "Keisha"},
                {"Ervina", "Cheyza", "Nisrina", "Rida", "Kafka"},
                {"Dani", "Gustova", "Fajar", "Najma", "Zalfa"}
            },
            {
                {"Aurira", "Tiara", "Rara", "Chika", "Alika"},
                {"Rayyan", "Anugra", "Kanza", "Alfan", "Dzaky"},
                {"Mahesa", "Anandya", "Evry", "Bintang", "Zayyan"}
            },
            {
                {"Salsa", "Raya", "Isa", "Giofan", "Orion"},
                {"Maulana", "Wir", "Dafir", "Abzan", "Rahmat"},
                {"Andrew", "Riko", "Fahri", "Dewa", "Yusuf"}
            } 
        };
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Program Studi " +(i + 1) + ": ");
            
            for (int j = 0; j < 3; j++) {
                System.out.print("Kelas " +(j + 1) + ": ");
                
                for (int k = 0; k < 5; k++) {
                    System.out.print(dataMahasiswa[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}