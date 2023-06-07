/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu2;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class BarangMain2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("+---------------------+");
        System.out.println("| Tanpa Inpurtan User |");
        System.out.println("+---------------------+");
        Barang2 brg = new Barang2();
        brg.hargaSatuan = 10000;
        brg.jumlah = 15;
        brg.hitungHargaBayar();
        brg.displayTagihan();
        
        int harga, jumlah;
        System.out.println("+---------------------------+");
        System.out.println("| Menggunakan Inputan User |");
        System.out.println("+---------------------------+");
        System.out.print("Masukkan harga\t: ");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah\t: ");
        jumlah = input.nextInt();
        Barang2 brg1 = new Barang2(harga, jumlah);
        brg1.hitungHargaBayar();
        brg1.displayTagihan();
    }
    
}
