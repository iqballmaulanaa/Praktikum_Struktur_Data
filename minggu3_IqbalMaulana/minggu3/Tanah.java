/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu3;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Tanah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah tanah: ");
        int jumlahTanah = input.nextInt();

        int panjang, lebar, luas;
        int maxLuas = 0, maxTanah = 0;

        for (int i = 1; i <= jumlahTanah; i++) {
            System.out.println("Tanah " + i);
            System.out.print("Panjang: ");
            panjang = input.nextInt();
            System.out.print("Lebar: ");
            lebar = input.nextInt();

            luas = panjang * lebar;
            System.out.println("Luas Tanah " + i + ": " + luas);

            if (luas > maxLuas) {
                maxLuas = luas;
                maxTanah = i;
            }
        }

        System.out.println("Tanah terluas: Tanah " + maxTanah);
    }
}