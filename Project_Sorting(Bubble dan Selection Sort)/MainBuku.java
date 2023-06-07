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


public class MainBuku {
    public static void main(String[] args) {
        Buku[] arr = {
            new Buku("Dasar Pemrograman", 294, 25.0),
            new Buku("Algoritma pemrograman", 1292, 29.7),
            new Buku("Rekayasa Perangkat Lunak", 824, 27.9),
            new Buku("Basis data", 400, 21.0),
                
        };

        System.out.println("Sebelum diurutkan:");
        for (Buku buku : arr) {
            System.out.println(buku);
        }
       Arrays.sort(arr, new PengurutanBuku.SortBuku());
        System.out.println("\nSetelah diurutkan:");
        for (Buku buku : arr) {
            System.out.println(buku);
        }
    }
}
