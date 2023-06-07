/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author USER
 */
public class MahasiswaMain {
    public static void main(String[] args) {
        // membuat objek mahasiswa1
        Mahasiswa mahasiswa1 = new Mahasiswa("Iqbal", 2018, 20, 3.5);

        // memanggil method tampil() dari objek mahasiswa1
        mahasiswa1.tampil();

        // membuat objek mahasiswa2
        Mahasiswa mahasiswa2 = new Mahasiswa("Maulana", 2019, 19, 3.8);

        // memanggil method tampil() dari objek mahasiswa2
        mahasiswa2.tampil();
    }
}