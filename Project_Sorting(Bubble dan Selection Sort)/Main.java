/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        int[] data = {15, 10, 7, 22, 5};
        Sort urut = new Sort(data, data.length);

        System.out.println("Data sebelum urut");
        urut.tampilData();

        // mengurutkan data dengan metode bubbleSort
        urut.bubbleSort();
        System.out.println("Data sesudah urut Bubble sort (ASC)");
        urut.tampilData();

        // mengurutkan data dengan metode selectionSort
        urut.selectionSort();
        System.out.println("Data sesudah urut Selection sort (ASC)");
        urut.tampilData();
    }
}