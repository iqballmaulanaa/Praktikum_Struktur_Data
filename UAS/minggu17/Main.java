/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu17;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Main {
    private static Kendaraan[] kendaraanList;
    private static Pajak[] pajakList;
    private static int totalPendapatan;

    public static void main(String[] args) {
        initializeData();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("=== MENU PEMBAYARAN PAJAK ===");
            System.out.println("1. Input Data Pajak");
            System.out.println("2. Tampilkan Transaksi");
            System.out.println("3. Total Pendapatan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    inputDataPajak(scanner);
                    break;
                case 2:
                    tampilkanTransaksi();
                    break;
                case 3:
                    tampilkanTotalPendapatan();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Menu tidak valid. Silakan pilih menu yang sesuai.");
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }

    private static void initializeData() {
        kendaraanList = new Kendaraan[2];
        kendaraanList[0] = new Kendaraan("B 1234 AB", "Kendaraan A", "roda 2", 200, 2019, 6);
        kendaraanList[1] = new Kendaraan("B 5678 CD", "Kendaraan B", "roda 4", 1500, 2020, 5);

        pajakList = new Pajak[0];
        totalPendapatan = 0;
    }

    private static void inputDataPajak(Scanner scanner) {
    System.out.println("=== INPUT DATA PAJAK ===");

    System.out.println("Pilih TNKB kendaraan:");
    for (int i = 0; i < kendaraanList.length; i++) {
        Kendaraan kendaraan = kendaraanList[i];
        System.out.println((i + 1) + ". TNKB: " + kendaraan.getTNKB());
        System.out.println("   Jenis Kendaraan: " + kendaraan.getJenis());
    }
    
    System.out.print("Masukkan pilihan: ");
    int pilihan = scanner.nextInt();
    scanner.nextLine(); 

    if (pilihan >= 1 && pilihan <= kendaraanList.length) {
        Kendaraan kendaraan = kendaraanList[pilihan - 1];

        System.out.print("Masukkan bulan bayar: ");
        int bulanBayar = scanner.nextInt();
        scanner.nextLine(); 

        Pajak pajak = createPajak(bulanBayar, kendaraan);
        if (pajak != null) {
            addPajak(pajak);
            System.out.println("Data pajak berhasil ditambahkan.");
        } else {
            System.out.println("Bulan bayar tidak valid.");
        }
    } else {
        System.out.println("Pilihan tidak valid.");
    }
}



    private static Pajak createPajak(int bulanBayar, Kendaraan kendaraan) {
        if (bulanBayar >= 1 && bulanBayar <= 12) {
            String jenis = kendaraan.getJenis();
            int cc = kendaraan.getCc();
            int nominal;

            if (jenis.equals("roda 2")) {
                if (cc < 100) {
                    nominal = 100000;
                } else if (cc >= 100 && cc <= 250) {
                    nominal = 250000;
                } else {
                    nominal = 500000;
                }
            } else {
                if (cc < 1000) {
                    nominal = 750000;
                } else if (cc >= 1000 && cc <= 2500) {
                    nominal = 1000000;
                } else {
                    nominal = 1500000;
                }
            }

            return new Pajak(nominal, bulanBayar, kendaraan);
        }
        return null;
    }

    private static void addPajak(Pajak pajak) {
        Pajak[] newPajakList = new Pajak[pajakList.length + 1];
        System.arraycopy(pajakList, 0, newPajakList, 0, pajakList.length);
        newPajakList[pajakList.length] = pajak;
        pajakList = newPajakList;
        totalPendapatan += pajak.getTotalBayar();
    }

    private static void tampilkanTransaksi() {
        System.out.println("=== TRANSAKSI PAJAK ===");
        for (Pajak pajak : pajakList) {
            Kendaraan kendaraan = pajak.getKendaraan();
            System.out.println("Kode Pajak: " + pajak.getKode());
            System.out.println("TNKB: " + kendaraan.getTNKB());
            System.out.println("Nama: " + kendaraan.getNama());
            System.out.println("Jenis Kendaraan: " + kendaraan.getJenis());
            System.out.println("CC: " + kendaraan.getCc());
            System.out.println("Bulan Bayar: " + pajak.getBulanBayar());
            System.out.println("Nominal: " + pajak.getNominal());
            System.out.println("Denda: " + pajak.getDenda());
            System.out.println("Total Bayar: " + pajak.getTotalBayar());
            System.out.println();
        }
    }

    private static void tampilkanTotalPendapatan() {
        System.out.println("Total Pendapatan: " + totalPendapatan);
    }
}