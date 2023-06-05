/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author USER
 */
public class Buku {
    private String judul;
    private int jumlahHalaman;
    private double ukuranBuku;

    public Buku(String judul, int jumlahHalaman, double ukuranBuku) {
        this.judul = judul;
        this.jumlahHalaman = jumlahHalaman;
        this.ukuranBuku = ukuranBuku;
    }

    public String getJudul() {
        return judul;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    public double getUkuranBuku() {
        return ukuranBuku;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "judul='" + judul + '\'' +
                ", jumlahHalaman=" + jumlahHalaman +
                ", ukuranBuku=" + ukuranBuku +
                '}';
    }
}