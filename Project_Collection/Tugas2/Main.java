/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas2;

/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private static List<MataKuliah> daftarMataKuliah = new ArrayList<>();
    private static List<Nilai> daftarNilai = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inisialisasiData();

        int pilihan;
        do {
            System.out.println("*********************************************************************************************************************************************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*********************************************************************************************************************************************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("*********************************************************************************************************************************************************************************");
            System.out.print("Pilih : ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membuang karakter newline dari input sebelumnya

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data");
                    System.out.print("Kode : ");
                    String kode = scanner.nextLine();
                    System.out.print("Nilai : ");
                    double nilai = scanner.nextDouble();
                    scanner.nextLine(); // Membuang karakter newline dari input sebelumnya
                    inputNilai(kode, nilai);
                    break;
                case 2:
                    tampilNilai();
                    break;
                case 3:
                    mencariNilaiMahasiswa();
                    break;
                case 4:
                    urutDataNilai();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);
    }

    private static void inisialisasiData() {
        daftarMahasiswa.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        daftarMahasiswa.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        daftarMataKuliah.add(new MataKuliah("00001", "Internet of Things", 3));
        daftarMataKuliah.add(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
        daftarMataKuliah.add(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));
        daftarMataKuliah.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMataKuliah.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }

    private static void inputNilai(String kode, double nilai) {
        Mahasiswa selectedMahasiswa = null;
        MataKuliah selectedMataKuliah = null;

        System.out.println("DAFTAR MAHASISWA");
        System.out.println("*********************************************************************************************************************************************************************************");
        System.out.println("NIM\tNama\tTelf");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa.getNim() + "\t" + mahasiswa.getNama() + "\t" + mahasiswa.getTelf());
        }

        System.out.print("Pilih mahasiswa by nim: ");
        String nim = scanner.nextLine();

        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            if (mahasiswa.getNim().equals(nim)) {
                selectedMahasiswa = mahasiswa;
                break;
            }
        }

        System.out.println("DAFTAR MATA KULIAH");
        System.out.println("*********************************************************************************************************************************************************************************");
        System.out.println("Kode\tMata Kuliah\tSKS");
        for (MataKuliah mataKuliah : daftarMataKuliah) {
            System.out.println(mataKuliah.getKode() + "\t" + mataKuliah.getNama() + "\t" + mataKuliah.getSks());
        }

        System.out.print("Pilih MK by kode: ");
        String kodeMK = scanner.nextLine();

        for (MataKuliah mataKuliah : daftarMataKuliah) {
            if (mataKuliah.getKode().equals(kodeMK)) {
                selectedMataKuliah = mataKuliah;
                break;
            }
        }

        if (selectedMahasiswa != null && selectedMataKuliah != null) {
            Nilai nilaiObj = new Nilai(selectedMahasiswa, selectedMataKuliah, nilai);
            daftarNilai.add(nilaiObj);
            System.out.println("Data nilai berhasil diinput.");
        } else {
            System.out.println("Maaf, input data nilai gagal.");
        }
    }

    private static void tampilNilai() {
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*********************************************************************************************************************************************************************************");
        System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
        for (Nilai nilai : daftarNilai) {
            Mahasiswa mahasiswa = nilai.getMahasiswa();
            MataKuliah mataKuliah = nilai.getMataKuliah();
            double nilaiMahasiswa = nilai.getNilai();

            System.out.println(mahasiswa.getNim() + "\t" + mahasiswa.getNama() + "\t" + mataKuliah.getNama() + "\t" + mataKuliah.getSks() + "\t" + nilaiMahasiswa);
        }
    }

    private static void mencariNilaiMahasiswa() {
        System.out.println("Pencarian Data Mahasiswa");
        System.out.println("*********************************************************************************************************************************************************************************");
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*********************************************************************************************************************************************************************************");
        System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
        for (Nilai nilai : daftarNilai) {
            Mahasiswa mahasiswa = nilai.getMahasiswa();
            MataKuliah mataKuliah = nilai.getMataKuliah();
            double nilaiMahasiswa = nilai.getNilai();

            System.out.println(mahasiswa.getNim() + "\t" + mahasiswa.getNama() + "\t" + mataKuliah.getNama() + "\t" + mataKuliah.getSks() + "\t" + nilaiMahasiswa);
        }

        System.out.print("Masukkan data mahasiswa[nim]: ");
        String nim = scanner.nextLine();

        System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
        for (Nilai nilai : daftarNilai) {
            Mahasiswa mahasiswa = nilai.getMahasiswa();
            MataKuliah mataKuliah = nilai.getMataKuliah();
            double nilaiMahasiswa = nilai.getNilai();

            if (mahasiswa.getNim().equals(nim)) {
                System.out.println(mahasiswa.getNim() + "\t" + mahasiswa.getNama() + "\t" + mataKuliah.getNama() + "\t" + mataKuliah.getSks() + "\t" + nilaiMahasiswa);
            }
        }
    }

    private static void urutDataNilai() {
        daftarNilai.sort((n1, n2) -> {
            double nilai1 = n1.getNilai();
            double nilai2 = n2.getNilai();

            return Double.compare(nilai2, nilai1);
        });

        System.out.println("Pengurutan Data Nilai");
        System.out.println("*********************************************************************************************************************************************************************************");
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("*********************************************************************************************************************************************************************************");
        System.out.println("NIM\tNama\tMata Kuliah\tSKS\tNilai");
        for (Nilai nilai : daftarNilai) {
            Mahasiswa mahasiswa = nilai.getMahasiswa();
            MataKuliah mataKuliah = nilai.getMataKuliah();
            double nilaiMahasiswa = nilai.getNilai();

            System.out.println(mahasiswa.getNim() + "\t" + mahasiswa.getNama() + "\t" + mataKuliah.getNama() + "\t" + mataKuliah.getSks() + "\t" + nilaiMahasiswa);
        }
    }
}