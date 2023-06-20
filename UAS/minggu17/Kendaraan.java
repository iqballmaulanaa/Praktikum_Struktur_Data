/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu17;

/**
 *
 * @author USER
 */

class Kendaraan {
    private String TNKB;
    private String nama;
    private String jenis;
    private int cc;
    private int tahun;
    private int bulanHarusBayar;

    public Kendaraan(String TNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        this.TNKB = TNKB;
        this.nama = nama;
        this.jenis = jenis;
        this.cc = cc;
        this.tahun = tahun;
        this.bulanHarusBayar = bulanHarusBayar;
    }

    public String getTNKB() {
        return TNKB;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getCc() {
        return cc;
    }

    public int getBulanHarusBayar() {
        return bulanHarusBayar;
    }
}