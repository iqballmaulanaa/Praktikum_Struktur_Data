/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author USER
 */
public class Paskibraka {
    String nama;
    String kelas;
    int tinggi;

    public Paskibraka(String a, String b, int c) {
        nama = a;
        kelas = b;
        tinggi = c;
    }

    public void tampilIdentitas() {
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Tinggi: " + tinggi + " cm");
    }
}