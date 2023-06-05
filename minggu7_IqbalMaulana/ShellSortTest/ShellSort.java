/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author USER
 */
public class ShellSort {
    public int[] data;
    public int jumData;
    
    public ShellSort(int[] data, int jumData) {
        this.jumData = jumData;
        this.data = new int[jumData];
        for (int i = 0; i < jumData; i++) {
            this.data[i] = data[i];
        }
    }
    
    public void tampilData() {
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    
    public void shellSort() {
        int interval;
        for (interval = jumData / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < jumData; i += 1) {
                int temp = data[i];
                int j;
                for (j = i; j >= interval && data[j - interval] > temp; j -= interval) {
                    data[j] = data[j - interval];
                }
                data[j] = temp;
            }
        }
    }
}