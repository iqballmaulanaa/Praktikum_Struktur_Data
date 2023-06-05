/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author USER
 */
import java.util.Comparator;

public class PengurutanBuku {

    public static class SortBuku implements Comparator<Buku> {

        @Override
        public int compare(Buku buku1, Buku buku2) {
            return buku1.getJudul().compareTo(buku2.getJudul());
        }
    }

    public static void bubbleSortUkuranBuku(Buku[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j].getUkuranBuku() > arr[j+1].getUkuranBuku()) {
                    Buku temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSortJumlahHalaman(Buku[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j].getJumlahHalaman() < arr[minIdx].getJumlahHalaman()) {
                    minIdx = j;
                }
            }
            Buku temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
