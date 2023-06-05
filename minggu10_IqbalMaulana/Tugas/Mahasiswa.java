/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author USER
 */
public class Mahasiswa {
  private String nim;
  private String nama;
  private int absen;
  private double ipk;

  public Mahasiswa(String nim, String nama, int absen, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.absen = absen;
    this.ipk = ipk;
  }

  public String getNim() {
    return nim;
  }

  public String getNama() {
    return nama;
  }

  public int getAbsen() {
    return absen;
  }

  public double getIpk() {
    return ipk;
  }
}