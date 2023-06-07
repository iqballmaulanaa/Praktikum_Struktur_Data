import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner ponkqy = new Scanner(System.in);
        String nim;
        String[] hari = {"senin", "selasa", "rabu", "kamis", "jumat", "sabtu", "minggu"};
        System.out.print("Masukkan Nim : ");
        nim = ponkqy.next();
        System.out.println("=============================");
        int[] arrayNim = new int[nim.length()];
        for (int i = 0; i < nim.length(); i++){
            arrayNim[i] = (int)nim.charAt(i);
        }
        for (int i = 0; i < nim.length(); i++){
            int k = 0;
            for (int j = 48; j < 58; j++){
                if (arrayNim[i] == j){
                    arrayNim[i] = 0 + k;
                }
                k++;
            }
        }
        if ((arrayNim[nim.length()-2]) == 0) {
            arrayNim[nim.length()-2] = 1;
        } 
        int banyakHari = (arrayNim[nim.length()-2]*10) + (arrayNim[nim.length()-1]);
        System.out.println("n = " + banyakHari);
        int n = 0;
        for (int i = 0; i < banyakHari; i++) {
            if (i%hari.length == 0) {
                n = 0;
            }
            System.out.print(hari[n]);
            System.out.print(" ");
            n++;
        }
    }
}