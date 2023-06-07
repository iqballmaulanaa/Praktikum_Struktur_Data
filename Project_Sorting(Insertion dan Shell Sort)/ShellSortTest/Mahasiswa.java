/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu7;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class Mahasiswa {
    String nama;
    int nilaiA;
    int nilaiB;
    int nilaiC;
    int total;

    public Mahasiswa(String nama, int nilaiA, int nilaiB, int nilaiC) {
        this.nama = nama;
        this.nilaiA = nilaiA;
        this.nilaiB = nilaiB;
        this.nilaiC = nilaiC;
        this.total = nilaiA + nilaiB + nilaiC;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] arrMhs = new Mahasiswa[5];

        for (int i = 0; i < arrMhs.length; i++) {
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = input.nextLine();
            System.out.print("Masukkan nilai A: ");
            int nilaiA = input.nextInt();
            System.out.print("Masukkan nilai B: ");
            int nilaiB = input.nextInt();
            System.out.print("Masukkan nilai C: ");
            int nilaiC = input.nextInt();
            input.nextLine();

            arrMhs[i] = new Mahasiswa(nama, nilaiA, nilaiB, nilaiC);
        }

        shellSort(arrMhs); // atau bisa diganti dengan insertionSort(arrMhs)

        System.out.println("Daftar Mahasiswa (berdasarkan total nilai tertinggi ke terendah): ");
        System.out.println("Nama\tNilai A\tNilai B\tNilai C\tTotal");
        for (int i = 0; i < arrMhs.length; i++) {
            System.out.println(arrMhs[i].nama + "\t" + arrMhs[i].nilaiA + "\t" + arrMhs[i].nilaiB + "\t"
                    + arrMhs[i].nilaiC + "\t" + arrMhs[i].total);
        }

        System.out.println("\n3 Mahasiswa Terbaik:");
        displayTop3(arrMhs);

        System.out.println("\n3 Mahasiswa dengan Total Nilai Terbaik:");
        displayTop3ByTotal(arrMhs);
    }

    public static void insertionSort(Mahasiswa[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Mahasiswa key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].total < key.total) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void shellSort(Mahasiswa[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Mahasiswa temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap].total < temp.total; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                 arr[j] = temp;
            }
        }
    }

    public static void displayTop3(Mahasiswa[] arr) {
for (int i = 0; i < Math.min(3, arr.length); i++) {
System.out.println(arr[i].nama + "\t" + arr[i].nilaiA + "\t" + arr[i].nilaiB + "\t" + arr[i].nilaiC
+ "\t" + arr[i].total);
}
    }
    public static void displayTop3ByTotal(Mahasiswa[] arr) {
    insertionSort(arr);
    for (int i = 0; i < Math.min(3, arr.length); i++) {
        System.out.println(arr[i].nama + "\t" + arr[i].nilaiA + "\t" + arr[i].nilaiB + "\t" + arr[i].nilaiC
                + "\t" + arr[i].total);
    }
    }
}