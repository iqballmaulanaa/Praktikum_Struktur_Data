/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Penduduk {
private int nik;
private String nama;
private String alamat;
private String jenisKelamin;

public Penduduk(int nik, String nama, String alamat, String jenisKelamin) {
    this.nik = nik;
    this.nama = nama;
    this.alamat = alamat;
    this.jenisKelamin = jenisKelamin;
}

public int getNik() {
    return nik;
}

public String getNama() {
    return nama;
}

public String getAlamat() {
    return alamat;
}

public String getJenisKelamin() {
    return jenisKelamin;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah penduduk: ");
    int jumlahPenduduk = input.nextInt();
    input.nextLine(); // mengambil input baris kosong

    Penduduk[] penduduk = new Penduduk[jumlahPenduduk];

    for (int i = 0; i < jumlahPenduduk; i++) {
        System.out.println("Penduduk ke-" + (i + 1));
        System.out.print("NIK: ");
        int nik = 0;
        try {
            nik = input.nextInt();
        } catch (Exception e) {
            System.out.println("NIK harus berupa angka!");
            input.nextLine(); // membersihkan buffer
            i--; // mengulangi input
            continue;
        }
        input.nextLine(); // mengambil input baris kosong
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Jenis Kelamin: ");
        String jenisKelamin = input.nextLine().toLowerCase();

        if (jenisKelamin.equals("laki-laki")) {
            jenisKelamin = "Laki - Laki";
        }

        penduduk[i] = new Penduduk(nik, nama, alamat, jenisKelamin);
    }

    System.out.println("--- DATA PENDUDUK ---");
    System.out.println("NO\tNIK\tNAMA\t\tALAMAT\t\t\tJENIS KELAMIN");
    for (int i = 0; i < jumlahPenduduk; i++) {
        System.out.printf("%2d\t%6d\t%-12s\t%-20s\t%-10s\n", (i + 1), penduduk[i].getNik(), penduduk[i].getNama(),
                penduduk[i].getAlamat(), penduduk[i].getJenisKelamin());
    }

    System.out.println("--- CARI DATA PENDUDUK ---");
    System.out.print("Masukkan data yang dicari: ");
    int cariNik = 0;
    try {
        cariNik = input.nextInt();
    } catch (Exception e) {    
        System.out.println("NIK harus berupa angka!");
        input.nextLine(); // membersihkan buffer
    }
    
    for (int i = 0; i < jumlahPenduduk; i++) {
        if (penduduk[i].getNik() == cariNik) {
            System.out.println("Data ditemukan:");
            System.out.printf("NIK: %d\n", penduduk[i].getNik());
            System.out.printf("Nama: %s\n", penduduk[i].getNama());
            System.out.printf("Alamat: %s\n", penduduk[i].getAlamat());
            System.out.printf("Jenis Kelamin: %s\n", penduduk[i].getJenisKelamin());
            break;
        }
    }
    if (cariNik != 0) {
        System.out.println("Data tidak ditemukan.");
    }
    input.close();
    }
}

