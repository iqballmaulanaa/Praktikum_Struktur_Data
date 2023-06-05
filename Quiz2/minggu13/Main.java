/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu13;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        AntrianNasabah antrian = new AntrianNasabah();
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;

        while (pilihan != 6) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Cari Nasabah");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Selesai Transaksi (Kondisi 1)");
            System.out.println("5. Tambah Nasabah Darurat (Kondisi 2)");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan karakter newline dari buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan No. Rekening: ");
                    String noRekening = scanner.nextLine();
                    System.out.print("Masukkan Nama Nasabah: ");
                    String nama = scanner.nextLine();
                    antrian.tambahNasabah(noRekening, nama);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Masukkan Nama Nasabah yang Dicari: ");
                    String namaCari = scanner.nextLine();
                    Nasabah nasabah = antrian.cariNasabah(namaCari);
                    if (nasabah != null) {
                        System.out.println("Nasabah ditemukan:");
                        nasabah.print();
                    } else {
                        System.out.println("Nasabah tidak ditemukan.");
                    }
                    System.out.println();
                    break;
                case 3:
                    antrian.tampilkanAntrian();
                    System.out.println();
                    break;
                case 4:
                    antrian.selesaiTransaksi();
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Masukkan No. Rekening Nasabah Darurat: ");
                    String noRekeningDarurat = scanner.nextLine();
                    System.out.print("Masukkan Nama Nasabah Darurat: ");
                    String namaDarurat = scanner.nextLine();
                    antrian.tambahNasabahDarurat(noRekeningDarurat, namaDarurat);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Terima kasih. Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    System.out.println();
            }
        }

        scanner.close();
    }
}