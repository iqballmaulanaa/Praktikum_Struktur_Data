import java.util.Scanner;
public class Tugas1 {
    public static double hitungNilai(int nilaiTugas, int nilaiUts, int nilaiUas) {
        return ((nilaiTugas*(0.2)) + (nilaiUts*(0.35)) + (nilaiUas*(0.45)));
    }
    public static boolean submit(int nilaiTugas, int nilaiUts, int nilaiUas) {
        if ((nilaiTugas >= 0 && nilaiTugas <= 100) && (nilaiUts >= 0 && nilaiUts <= 100) && (nilaiUas >= 0 && nilaiUas <= 100)) {
            return false;
        }
        else {
            System.out.println("format salah, inputkan(nilai 0 - 100)");
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner ponkqy = new Scanner(System.in);
        int nilaiTUGAS, nilaiUTS, nilaiUAS;
        double nilaiAngka;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("===================");
        boolean syarat = true;
        while (syarat) {
            System.out.print("Masukkan Nilai Tugas: ");
            nilaiTUGAS = ponkqy.nextInt();
            System.out.print("Masukkan Nilai UTS: ");
            nilaiUTS = ponkqy.nextInt();
            System.out.print("Masukkan Nilai UAS: ");
            nilaiUAS = ponkqy.nextInt();
            syarat = submit(nilaiTUGAS, nilaiUTS, nilaiUAS);

            if (syarat == false) {
                nilaiAngka = hitungNilai(nilaiTUGAS, nilaiUTS, nilaiUAS);
                System.out.println("===================");
                System.out.println();
                System.out.println("===================");
                System.out.println("nilai akhir : " + nilaiAngka);
                
                if (nilaiAngka > 80 && nilaiAngka <= 100){
                    System.out.println("Nilai huruf : A");
                    System.out.println("===================");
                    System.out.println("SELAMAT LULUS");
                } else if (nilaiAngka > 73 && nilaiAngka <= 80){
                    System.out.println("Nilai huruf : B+");
                    System.out.println("===================");
                    System.out.println("SELAMAT LULUS");
                } else if (nilaiAngka > 65 && nilaiAngka <= 73){
                    System.out.println("Nilai huruf : B");
                    System.out.println("===================");
                    System.out.println("SELAMAT LULUS");
                } else if (nilaiAngka > 60 && nilaiAngka <= 65){
                    System.out.println("Nilai huruf : C+");
                    System.out.println("===================");
                    System.out.println("SELAMAT LULUS");
                } else if (nilaiAngka > 50 && nilaiAngka <= 60){
                    System.out.println("Nilai huruf : C");
                    System.out.println("===================");
                    System.out.println("SELAMAT LULUS");
                } else if (nilaiAngka > 39 && nilaiAngka <= 50){
                    System.out.println("Nilai huruf : D");
                    System.out.println("===================");
                    System.out.println("SELAMAT LULUS");
                } else if (nilaiAngka <= 39){
                    System.out.println("Nilai huruf : E");
                    System.out.println("===================");
                    System.out.println("SELAMAT LULUS");
                } 
            } 
        }
    }
}