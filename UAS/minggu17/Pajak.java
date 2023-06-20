/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu17;

/**
 *
 * @author USER
 */
class Pajak {
    private static int kodeCounter = 1;

    private int kode;
    private int nominal;
    private int denda;
    private int bulanBayar;
    private Kendaraan kendaraan;

    public Pajak(int nominal, int bulanBayar, Kendaraan kendaraan) {
        this.kode = kodeCounter++;
        this.nominal = nominal;
        this.bulanBayar = bulanBayar;
        this.kendaraan = kendaraan;

        int bulanHarusBayar = kendaraan.getBulanHarusBayar();
        if (bulanBayar > bulanHarusBayar) {
            int bulanTerlambat = bulanBayar - bulanHarusBayar;
            if (bulanTerlambat <= 3) {
                this.denda = 50000;
            } else {
                this.denda = bulanTerlambat * 50000;
            }
        } else {
            this.denda = 0;
        }
    }

    public int getKode() {
        return kode;
    }

    public int getNominal() {
        return nominal;
    }

    public int getDenda() {
        return denda;
    }

    public int getTotalBayar() {
        return nominal + denda;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    public int getBulanBayar() {
        return bulanBayar;
    }
}