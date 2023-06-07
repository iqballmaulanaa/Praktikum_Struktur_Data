/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author USER
 */
public class Tugas1b {
    public static void main(String[] args) {
      String[] namaBarang = {"Pensil", "Buku", "Penggaris", "Bulpen"};
      int[] stokBarang = {35, 20, 50, 25};
      int[] hargaBarang = {1000, 5000, 1500, 2000};

      int n = stokBarang.length;
      for (int gap = n/2; gap > 0; gap /= 2) {
         for (int i = gap; i < n; i += 1) {
            int key = stokBarang[i];
            String keyNama = namaBarang[i];
            int keyHarga = hargaBarang[i];
            int j;

            for (j = i; j >= gap && stokBarang[j - gap] < key; j -= gap) {
               stokBarang[j] = stokBarang[j - gap];
               namaBarang[j] = namaBarang[j - gap];
               hargaBarang[j] = hargaBarang[j - gap];
            }
            stokBarang[j] = key;
            namaBarang[j] = keyNama;
            hargaBarang[j] = keyHarga;
         }
      }

      System.out.println("Barang diurutkan berdasarkan stok yang paling banyak:");
      System.out.printf("%-20s%-20s%s\n", "Nama Barang", "Stok", "Harga");
      for (int i = 0; i < n; ++i)
         System.out.printf("%-20s%-20s%s\n", namaBarang[i], stokBarang[i], hargaBarang[i]);
   }
}