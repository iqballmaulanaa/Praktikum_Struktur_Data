/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu8;

/**
 *
 * @author USER
 */


class Barang {
  String kode;
  String namaBarang;
  int stok;
  int hargaSatuan;

  public Barang(String kode, String namaBarang, int stok, int hargaSatuan) {
    this.kode = kode;
    this.namaBarang = namaBarang;
    this.stok = stok;
    this.hargaSatuan = hargaSatuan;
  }

  public String getKode() {
    return kode;
  }

  public String getNamaBarang() {
    return namaBarang;
  }

  public int getStok() {
    return stok;
  }

  public int getHargaSatuan() {
    return hargaSatuan;
  }

  public void setStok(int stok) {
    this.stok = stok;
  }

  public int getTotalHarga(int jumlahBeli) {
    return hargaSatuan * jumlahBeli;
  }

  public String toString() {
    return kode + "\t" + namaBarang + "\t" + stok + "\t" + hargaSatuan;
  }
}