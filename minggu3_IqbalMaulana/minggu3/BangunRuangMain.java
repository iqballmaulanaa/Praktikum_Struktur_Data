/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class BangunRuangMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah bangun ruang: ");
        int jumlahBangunRuang = scanner.nextInt();

        Object[] bangunRuang = new Object[jumlahBangunRuang];

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.print("\nBangun Ruang ke-" + (i+1) + "\n");
            System.out.print("Pilih jenis bangun ruang (1 = Balok, 2 = Tabung, 3 = Kerucut): ");
            int jenisBangunRuang = scanner.nextInt();

            switch (jenisBangunRuang) {
                case 1:
                    System.out.print("Masukkan panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggi = scanner.nextDouble();

                    Balok balok = new Balok(panjang, lebar, tinggi);
                    bangunRuang[i] = balok;

                    break;

                case 2:
                                    System.out.print("Masukkan jari-jari: ");
                double jariJariTabung = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiTabung = scanner.nextDouble();

                Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                bangunRuang[i] = tabung;

                break;

            case 3:
                System.out.print("Masukkan jari-jari: ");
                double jariJariKerucut = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiKerucut = scanner.nextDouble();
                System.out.print("Masukkan garis pelukis: ");
                double garisPelukis = scanner.nextDouble();

                Kerucut kerucut = new Kerucut(jariJariKerucut, tinggiKerucut, garisPelukis);
                bangunRuang[i] = kerucut;

                break;

            default:
                System.out.println("Jenis bangun ruang tidak valid.");
                break;
        }
    }

    System.out.println("\n=== Hasil Perhitungan ===");

    for (int i = 0; i < jumlahBangunRuang; i++) {
        Object obj = bangunRuang[i];

        if (obj instanceof Balok) {
            Balok balok = (Balok) obj;

            System.out.println("\nBangun Ruang ke-" + (i+1));
            System.out.println("Jenis bangun ruang: Balok");
            System.out.println("Luas permukaan: " + balok.getLuasPermukaan());
            System.out.println("Volume: " + balok.getVolume());

        } else if (obj instanceof Tabung) {
            Tabung tabung = (Tabung) obj;

            System.out.println("\nBangun Ruang ke-" + (i+1));
            System.out.println("Jenis bangun ruang: Tabung");
            System.out.println("Luas permukaan: " + tabung.getLuasPermukaan());
            System.out.println("Volume: " + tabung.getVolume());

        } else if (obj instanceof Kerucut) {
            Kerucut kerucut = (Kerucut) obj;

            System.out.println("\nBangun Ruang ke-" + (i+1));
            System.out.println("Jenis bangun ruang: Kerucut");
            System.out.println("Luas permukaan: " + kerucut.getLuasPermukaan());
            System.out.println("Volume: " + kerucut.getVolume());
        }
    }
}
}