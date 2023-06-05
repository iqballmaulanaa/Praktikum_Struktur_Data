/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu13;

/**
 *
 * @author USER
 */

class Nasabah {
    String noRekening;
    String nama;
    Nasabah next;

    Nasabah(String noRek, String nm) {
        noRekening = noRek;
        nama = nm;
        next = null;
    }

    Nasabah() {
        noRekening = "";
        nama = "";
        next = null;
    }

    void print() {
        System.out.println("No. Rekening: " + noRekening);
        System.out.println("Nama: " + nama);
    }
}