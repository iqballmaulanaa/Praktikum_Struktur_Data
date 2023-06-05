/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author USER
 */
public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {17, 20, 26, 33, 37, 41, 53, 65, 73, 83};
        
        int x = 41;
        int index = sequentialSearch(arr, x);
        if (index == -1) {
            System.out.println("Nilai " + x + " tidak ditemukan dalam array.");
        } else {
            System.out.println("Nilai " + x + " ditemukan pada index " + index + ".");
        }
        
        x = 50;
        index = binarySearch(arr, x);
        if (index == -1) {
            System.out.println("Nilai " + x + " tidak ditemukan dalam array.");
        } else {
            System.out.println("Nilai " + x + " ditemukan pada index " + index + ".");
        }
    }
    
    public static int sequentialSearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}