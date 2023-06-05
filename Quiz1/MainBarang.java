/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz1;

/**
 *
 * @author USER
 */
import java.util.Scanner;

public class MainBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Inisialisasi data barang
        Barang[] daftarBarang = {
                new Barang("K01", "Sabun", 1000, 5),
                new Barang("K02", "Pasta Gigi", 2000, 10),
                new Barang("K03", "Biore", 3000, 23),
                new Barang("K04", "Shampoo", 4000, 55),
                new Barang("K05", "Sikat Gigi", 5000, 65)
        };

        TransaksiBarang transaksi = new TransaksiBarang(daftarBarang);
      

        boolean exit = false;

        do {
            System.out.println("=========================");
            System.out.println("TOKO MAJU MUNDUR CANTIK");
            System.out.println("=========================");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan pembelian");
            System.out.println("4. Keluar");

            System.out.print("Pilih (1-4) : ");
            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    transaksi.tampilkanBarang();
                    break;
                case 2:
                    transaksi.beliBarang();
                    break;
                case 3:
                    transaksi.tampilkanPembelian();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Terima kasih telah berbelanja di Toko Maju Mundur Cantik!");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        } while (!exit);

        input.close();
    }
}