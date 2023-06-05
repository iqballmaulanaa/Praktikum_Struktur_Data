/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1;



/**
 *
 * @author USER
 */
import java.util.Scanner;

public class TransaksiBarang {
    private Barang[] barangs;
    private Barang[] belanjaan;

    public TransaksiBarang(int size) {
        barangs = new Barang[size];
        belanjaan = new Barang[size];
    }

    public TransaksiBarang(Barang[] daftarBarang) {
        this.barangs = daftarBarang;
        this.belanjaan = new Barang[daftarBarang.length];
    }

    public void tampilkanBarang() {
        System.out.println("=========================");
        System.out.println("Daftar Barang");
        System.out.println("=========================");
        System.out.println("Kode\tNama\tHarga\tStok");
        for (Barang barang : barangs) {
            System.out.println(barang);
        }
    }

    public void beliBarang() {
        Scanner scanner = new Scanner(System.in);
        String kodeBarang;
        boolean isBelanjaLagi = true;
        int indexBelanjaan = 0;

        while (isBelanjaLagi) {
            System.out.println("=========================");
            System.out.println("Daftar Barang");
            System.out.println("=========================");
            System.out.println("Kode\tNama\tHarga\tStok");
            for (Barang barang : barangs) {
                System.out.println(barang);
            }

            System.out.print("Masukkan kode barang: ");
            kodeBarang = scanner.nextLine();

            boolean isBarangDitemukan = false;
            for (Barang barang : barangs) {
                if (barang.getKode().equalsIgnoreCase(kodeBarang)) {
                    if (barang.getStok() > 0) {
                        barang.setStok(barang.getStok() - 1);
                        belanjaan[indexBelanjaan] = barang;
                        indexBelanjaan++;
                    } else {
                        System.out.println("Stok barang " + kodeBarang + " habis");
                    }
                    isBarangDitemukan = true;
                    break;
                }
            }

            if (!isBarangDitemukan) {
                System.out.println("Barang " + kodeBarang + " tidak ditemukan");
            }

            System.out.print("Apakah akan belanja kembali(Y/N)? ");
            String jawaban = scanner.nextLine();
            if (jawaban.equalsIgnoreCase("N")) {
                isBelanjaLagi = false;
            }
        }
    }

    public void tampilkanPembelian() {
        System.out.println("==================");
        System.out.println("List Belanjaan");
        System.out.println("==================");
        System.out.println("Kode\tNama\t\tHarga\tStok");
        for (Barang barang : this.belanjaan) {
            if (barang != null) {
                System.out.println(barang.getKode() + "\t" + barang.getNama() + "\t\t" + barang.getHarga() + "\t" + barang.getStok());
            }
        }
    }
}