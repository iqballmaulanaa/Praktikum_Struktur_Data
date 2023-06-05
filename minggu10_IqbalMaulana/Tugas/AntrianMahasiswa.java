/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class AntrianMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimum antrian: ");
        int n = input.nextInt();
        Queue q = new Queue(n);
        int pilihan;
        do {
            System.out.println("Menu");
            System.out.println("1. Tambah mahasiswa ke antrian");
            System.out.println("2. Keluarkan mahasiswa dari antrian");
            System.out.println("3. Tampilkan mahasiswa paling depan");
            System.out.println("4. Tampilkan mahasiswa paling belakang");
            System.out.println("5. Tampilkan posisi seorang mahasiswa dalam antrian");
            System.out.println("6. Tampilkan data mahasiswa pada posisi tertentu dalam antrian");
            System.out.println("7. Keluar dari program");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = input.next();
                    System.out.print("Masukkan nama: ");
                    String nama = input.next();
                    System.out.print("Masukkan absen: ");
                    int absen = input.nextInt();
                    System.out.print("Masukkan IPK: ");
                    double ipk = input.nextDouble();
                    Mahasiswa m = new Mahasiswa(nim, nama, absen, ipk);
                    q.enqueue(m);
                    break;
                case 2:
                    System.out.print("Masukkan posisi mahasiswa yang akan dikeluarkan: ");
                    int posisi = input.nextInt();
                    q.dequeue(posisi);
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan NIM mahasiswa yang ingin dicari: ");
                    String nimCari = input.next();
                    q.peekPosition(nimCari);
                    break;
                case 6:
                    System.out.print("Masukkan posisi mahasiswa yang ingin ditampilkan: ");
                    int posisi2 = input.nextInt();
                    q.printMahasiswa(posisi2);
                    break;
                case 7:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
            System.out.println();
        } while (pilihan != 7);
    }
}