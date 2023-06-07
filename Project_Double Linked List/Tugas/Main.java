/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu12;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
FilmList filmList = new FilmList();
                int pilihan;
    do {
        System.out.println("=========================");
        System.out.println("DATA FILM LAYAR LEBAR");
        System.out.println("=========================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari ID Film");
        System.out.println("9. Urut Data Rating Film-DESC");
        System.out.println("10. Keluar");
        System.out.println("=========================");
        System.out.print("Pilihan: ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Masukkan Data Film Posisi Awal");
                System.out.print("ID Film: ");
                int idAwal = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Judul Film: ");
                String judulAwal = scanner.nextLine();
                System.out.print("Rating Film: ");
                double ratingAwal = scanner.nextDouble();
                filmList.tambahDataAwal(idAwal, judulAwal, ratingAwal);
                break;
            case 2:
                System.out.println("Masukkan Data Film Posisi Akhir");
                System.out.print("ID Film: ");
                int idAkhir = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Judul Film: ");
                String judulAkhir = scanner.nextLine();
                System.out.print("Rating Film: ");
                double ratingAkhir = scanner.nextDouble();
                filmList.tambahDataAkhir(idAkhir, judulAkhir, ratingAkhir);
                break;
            case 3:
                System.out.println("Masukkan Data Film");
                System.out.print("Urutan ke-: ");
                int posisi = scanner.nextInt();
                scanner.nextLine();
                System.out.print("ID Film: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Judul Film: ");
                String judul = scanner.nextLine();
                System.out.print("Rating Film: ");
                double rating = scanner.nextDouble();
                filmList.tambahDataTertentu(id, judul, rating, posisi);
                break;
            case 4:
                filmList.hapusDataPertama();
                break;
            case 5:
                 filmList.hapusDataTerakhir();
                break;
            case 6:
                System.out.print("Masukkan posisi data yang akan dihapus: ");
                int posisiHapus = scanner.nextInt();
                filmList.hapusDataTertentu(posisiHapus);
                break;
            case 7:
                System.out.println("Cetak Data");
                filmList.cetakData();
                break;
            case 8:
                System.out.println("Cari Data");
                System.out.print("Masukkan ID Film yang dicari: ");
                int idCari = scanner.nextInt();
                Film hasilCari = filmList.cariData(idCari);
                if (hasilCari != null) {
                    System.out.println("Data ID Film: " + hasilCari.id + " berada di node ke-" + posisi(hasilCari));
                    System.out.println("IDENTITAS:");
                    System.out.println("ID Film: " + hasilCari.id);
                    System.out.println("Judul Film: " + hasilCari.judul);
                    System.out.println("IMDB Rating: " + hasilCari.rating);
                } else {
                    System.out.println("Data tidak ditemukan.");
                }
                break;
            case 9:
                filmList.urutDataRatingDesc();
                break;
            case 10:
                System.out.println("Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    } while (pilihan != 10);
}
public static int posisi(Film film) {
    int pos = 1;
    Film current = film;
    while (current.prev != null) {
        current = current.prev;
        pos++;
    }
    return pos;
}
}