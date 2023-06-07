/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author USER
 */
public class ArrayTerbesar {
    public static void main(String[] args) {
        int[] array = {12, 15, 6, 3, 70, 51, 83, 15, 3, 83};
        int terbesar = array[0];
        int[] posisiTerbesar = {0};

        for (int i = 1; i < array.length; i++) {
            if (array[i] > terbesar) {
                terbesar = array[i];
                posisiTerbesar = new int[]{i};
            } else if (array[i] == terbesar) {
                int[] temp = new int[posisiTerbesar.length+1];
                for (int j = 0; j < posisiTerbesar.length; j++) {
                    temp[j] = posisiTerbesar[j];
                }
                temp[temp.length-1] = i;
                posisiTerbesar = temp;
            }
        }

        System.out.println("Nilai terbesar: " + terbesar);
        System.out.print("Posisi nilai terbesar: ");
        for (int i = 0; i < posisiTerbesar.length; i++) {
            System.out.print(posisiTerbesar[i] + " ");
        }
    }
}