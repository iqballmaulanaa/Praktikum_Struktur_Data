/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package minggu2;

/**
 *
 * @author USER
 */
public class BarangMain {

    public static void main(String[] args) {
        Barang b1 = new Barang();
        
        b1.namaBarang = "Crosair 2 GB";
        b1.jenisBarang = "DDR";
        b1.hargaSatuan = 250000;
        b1.stok = 0;
        b1.tambahStok(1);
        b1.kurangiStok(3);
        b1.tampilBarang();

        int hargaTotal = b1.hitungHargaTotal(4);
        System.out.println("Harga 4 buah = " + hargaTotal);
        Barang b2 = new Barang("Logitech", "Wireless Mouse", 25, 150000);
        b2.tampilBarang();
    }
}
