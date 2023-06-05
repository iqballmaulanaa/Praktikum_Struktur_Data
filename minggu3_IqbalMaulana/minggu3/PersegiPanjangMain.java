/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;
import java.util.Scanner;
/**
 *
 * @author USER
 */


public class PersegiPanjangMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] data = new int[3][2];
        
        // Membaca data persegi panjang
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            data[i][0] = input.nextInt();
            System.out.print("Masukkan lebar: ");
            data[i][1] = input.nextInt();
        }
        
        // Menampilkan data persegi panjang
        for (int i = 0; i < 3; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + data[i][0] + ", lebar: " + data[i][1]);
        }
    }
}