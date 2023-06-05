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

public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim, jenisKelamin;
        double ipk;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + i);
            System.out.print("Masukkan nama : ");
            nama = input.nextLine();
            System.out.print("Masukkan nim : ");
            nim = input.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            jenisKelamin = input.nextLine();
            System.out.print("Masukkan IPK : ");
            ipk = input.nextDouble();
            input.nextLine();

            System.out.println("Data Mahasiswa ke-" + i);
            System.out.println("nama : " + nama);
            System.out.println("nim : " + nim);
            System.out.println("Jenis kelamin : " + jenisKelamin);
            System.out.println("Nilai IPK : " + ipk);
        }
    }
}