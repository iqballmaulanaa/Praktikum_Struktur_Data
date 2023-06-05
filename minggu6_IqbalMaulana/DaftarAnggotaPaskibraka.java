/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author USER
 */

import java.util.Arrays;
import java.util.Comparator;

public class DaftarAnggotaPaskibraka {
    Paskibraka[] listPeserta = new Paskibraka[10];
    int id = 0;

    public void tambah(Paskibraka m) {
        if (id < listPeserta.length) {
            listPeserta[id] = m;
            id++;
        } else {
            System.out.println("Kuota penuh");
        }
    }

    public void tampil() {
        for (int i = 0; i < id; i++) {
            System.out.println("Peserta ke-" + (i+1) + ":");
            listPeserta[i].tampilIdentitas();
            System.out.println("");
        }
    }

    public void tampilSeleksi(int tinggiMin) {
        for (int i = 0; i < id; i++) {
            System.out.println("Peserta ke-" + (i+1) + ":");
            listPeserta[i].tampilIdentitas();
            if (listPeserta[i].tinggi >= tinggiMin) {
                System.out.println("Lolos seleksi");
            } else {
                System.out.println("Tidak lolos seleksi");
            }
            System.out.println("");
        }
    }

    public void Sorting() {
        Arrays.sort(listPeserta, 0, id, new Comparator<Paskibraka>() {
            @Override
            public int compare(Paskibraka p1, Paskibraka p2) {
                if (p1.tinggi < p2.tinggi) {
                    return 1;
                } else if (p1.tinggi > p2.tinggi) {
                    return -1;
                }
                return 0;
            }
        });
    }

    public Paskibraka cari(String nama) {
        for (int i = 0; i < id; i++) {
            if (listPeserta[i].nama.equalsIgnoreCase(nama)) {
                return listPeserta[i];
            }
        }
        return null;
    }
}
