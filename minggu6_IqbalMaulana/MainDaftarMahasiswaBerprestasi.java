/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu6;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class MainDaftarMahasiswaBerprestasi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;

        // Lakukan operasi lainnya di sini
        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Nama = ");
            String nama = s1.nextLine();
            System.out.print("Thn masuk = ");
            int thn = s.nextInt();
            System.out.print("Umur = ");
            int umur = s.nextInt();
            System.out.print("IPK = ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nama, thn, umur, ipk);
            data.tambah(m);

            System.out.println("-----------------");
            System.out.println("Data mahasiswa sebelum sorting= ");
            data.tampil();

            System.out.println("Data mahasiswa setelah sorting desc berdasar ipk= ");
            data.bubbleSort();
            data.tampil();

            System.out.println("Data mahasiswa setelah sorting asc berdasar ipk= ");
            data.selectionSort();
            data.tampil();
        }
    }
}