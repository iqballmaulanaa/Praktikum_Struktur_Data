/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu5;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class CariMahasiswa {
    public static void main(String[] args) {
        // daftar mahasiswa
        String[] mahasiswa = {"Alfi", "Safira", "Tiara", "Alif", "Erdi",
                              "Yudha", "Nisa", "Yulia", "Fauzan", "Dwi",
                              "Dewa", "Ana", "Abdul", "Dani", "Ammar"};

        // pembagian kelompok
        String[][] kelompok = new String[3][5];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                kelompok[i][j] = mahasiswa[count];
                count++;
            }
        }

        // cetak daftar kelompok
        System.out.println("Daftar Kelompok Mahasiswa");
        for (int i = 0; i < 3; i++) {
            System.out.print("Kelompok " + (i+1) + " : ");
            for (int j = 0; j < 5; j++) {
                System.out.print(kelompok[i][j] + " ");
            }
            System.out.println();
        }

        // cari nama mahasiswa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama mahasiswa yang dicari");
        String cari = scanner.nextLine();
        int kelompokIndex = -1;
        int urutan = -1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (kelompok[i][j].equals(cari)) {
                    kelompokIndex = i + 1;
                    urutan = j + 1;
                    break;
                }
            }
            if (kelompokIndex != -1 && urutan != -1) {
                break;
            }
        }

        // cetak hasil pencarian
        if (kelompokIndex != -1 && urutan != -1) {
            System.out.println("Mahasiswa bernama " + cari + " berada pada kelompok ke-" + kelompokIndex + " dan urutan ke-" + urutan + " dalam kelompok");
        } else {
            System.out.println("Mahasiswa bernama " + cari + " tidak ditemukan");
        }
    }
}