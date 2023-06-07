/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author USER
 */
public class ShellSortTest {
    public static void main(String[] args) {
        int a[] = {73, 67, 56, 32, 52, 41, 83, 37, 32, 10};

        ShellSort urut = new ShellSort(a, a.length);

        System.out.println("Data sebelum urut");
        urut.tampilData();

        urut.shellSort();

        System.out.println("Data sesudah urut dengan Shell Sort (ASC)");
        urut.tampilData();
    }
}