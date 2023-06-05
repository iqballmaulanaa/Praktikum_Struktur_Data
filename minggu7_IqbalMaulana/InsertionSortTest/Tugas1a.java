/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author USER
 */
public class Tugas1a {
   public static void main(String[] args) {
      String[] namaBarang = {"Pensil", "Buku", "Penggaris", "Bulpen"};
      int[] stokBarang = {35, 20, 50, 25};
      int[] hargaBarang = {1000, 5000, 1500, 2000};

      int n = stokBarang.length;
      for (int i = 1; i < n; ++i) {
         int key = stokBarang[i];
         String keyNama = namaBarang[i];
         int keyHarga = hargaBarang[i];
         int j = i - 1;

         while (j >= 0 && stokBarang[j] < key) {
            stokBarang[j + 1] = stokBarang[j];
            namaBarang[j + 1] = namaBarang[j];
            hargaBarang[j + 1] = hargaBarang[j];
            j = j - 1;
         }
         stokBarang[j + 1] = key;
         namaBarang[j + 1] = keyNama;
         hargaBarang[j + 1] = keyHarga;
      }

      System.out.println("Barang diurutkan berdasarkan stok yang paling banyak:");
      System.out.printf("%-20s%-20s%s\n", "Nama Barang", "Stok", "Harga");
      for (int i = 0; i < n; ++i)
         System.out.printf("%-20s%-20s%s\n", namaBarang[i], stokBarang[i], hargaBarang[i]);
   }
}