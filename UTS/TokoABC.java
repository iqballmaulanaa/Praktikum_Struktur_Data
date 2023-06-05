/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minggu8;

/**
 *
 * @author USER
 */
import java.util.*;
public class TokoABC {
  private static ArrayList<Barang> daftarBarang = new ArrayList<>();

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pilihan = 0;

    do {
      System.out.println("\nMenu Toko ABC");
      System.out.println("1. Input Data Barang");
      System.out.println("2. Penjualan Barang");
      System.out.println("3. Mengurutkan Data Barang");
      System.out.println("4. Menampilkan Barang Terlaris");
      System.out.println("5. Tampil Seluruh Barang");
      System.out.println("6. Keluar");

      System.out.print("\nMasukkan pilihan: ");
      pilihan = input.nextInt();
      input.nextLine();

      switch (pilihan) {
        case 1:
          inputBarang();
          break;
        case 2:
          penjualanBarang();
          break;
        case 3:
          urutkanDataBarang();
          break;
        case 4:
          tampilkanBarangTerlaris();
          break;
        case 5:
          tampilkanSeluruhBarang();
          break;
        case 6:
          System.out.println("\nTerima kasih telah menggunakan program Toko ABC!");
          break;
        default:
          System.out.println("\nPilihan tidak valid, silakan coba lagi.");
      }
    } while (pilihan != 6);
  }

  private static void inputBarang() {
    Scanner input = new Scanner(System.in);
    String kode, namaBarang;
    int stok, hargaSatuan;

    System.out.println("\nInput Data Barang");
    System.out.print("Kode: ");
    kode = input.nextLine();
    System.out.print("Nama Barang: ");
    namaBarang = input.nextLine();
    System.out.print("Stok: ");
    stok = input.nextInt();
    System.out.print("Harga Satuan: ");
    hargaSatuan = input.nextInt();

    Barang barang = new Barang(kode, namaBarang, stok, hargaSatuan);
    daftarBarang.add(barang);

    System.out.println("\nData barang berhasil diinputkan.");
  }

  private static void penjualanBarang() {
      Scanner input = new Scanner(System.in);
    String kode, namaBarang;
    int jumlahBeli, totalHarga, totalBayar = 0;

    System.out.println("\nPenjualan Barang");
    System.out.print("Masukkan kode barang: ");
kode = input.nextLine();
Barang barang = cariBarang(kode);

if (barang == null) {
  System.out.println("\nBarang tidak ditemukan.");
} else {
  System.out.println("\nData Barang:");
  System.out.println(barang.toString());

  System.out.print("Jumlah beli: ");
  jumlahBeli = input.nextInt();

  if (jumlahBeli > barang.getStok()) {
    System.out.println("\nStok barang tidak cukup.");
  } else {
    totalHarga = barang.getTotalHarga(jumlahBeli);
    barang.setStok(barang.getStok() - jumlahBeli);
    totalBayar += totalHarga;

    System.out.println("\nBerikut adalah struk penjualan Anda:");
    System.out.println("Kode\tNama Barang\tJumlah Beli\tHarga Satuan\tTotal Harga");
    System.out.println(barang.getKode() + "\t" + barang.getNamaBarang() + "\t" + jumlahBeli + "\t\t" +
        barang.getHargaSatuan() + "\t\t" + totalHarga);
  }
}

System.out.println("\nTotal bayar: " + totalBayar);
  }
  private static void urutkanDataBarang() {
      System.out.println("\nData Barang (Urutkan Berdasarkan Stok Terbanyak)");
      if (daftarBarang.size() == 0) {
  System.out.println("\nTidak ada data barang.");
  return;
}
      Collections.sort(daftarBarang, new Comparator<Barang>() {
  public int compare(Barang b1, Barang b2) {
    return b2.getStok() - b1.getStok();
  }
});

System.out.println("Kode\tNama Barang\tStok\tHarga Satuan");
for (Barang barang : daftarBarang) {
  System.out.println(barang.toString());
}
  }
  private static void tampilkanBarangTerlaris() {
      System.out.println("\nBarang Terlaris");
      if (daftarBarang.size() == 0) {
  System.out.println("\nTidak ada data barang.");
  return;
}

Barang barangTerlaris = daftarBarang.get(0);
for (Barang barang : daftarBarang) {
  if (barang.getStok() < barangTerlaris.getStok()) {
    break;
  }
  barangTerlaris = barang;
}
System.out.println("Kode\tNama Barang\tStok\tHarga Satuan");
System.out.println(barangTerlaris.toString());
  }
  private static void tampilkanSeluruhBarang() {
      System.out.println("\nSeluruh Data Barang");
      if (daftarBarang.size() == 0) {
  System.out.println("\nTidak ada data barang.");
  return;
}

System.out.println("Kode\tNama Barang\tStok\tHarga Satuan");
for (Barang barang : daftarBarang) {
  System.out.println(barang.toString());
}
  }
  private static Barang cariBarang(String kode) {
      for (Barang barang : daftarBarang) {
          if (barang.getKode().equals(kode)) {
              return barang;
          }
      }
      return null;
  }
}